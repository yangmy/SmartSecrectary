package com.jojo.datearrange.dboption;

import java.util.List;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public abstract class BasedbOption {

	public static String DB_NAME="datearrange.db";
	static String INIT_TABLE_THING="create table thing(_id integer primary key,title text,description text,isvoice boolean,voice text)";
	
	MySqliteDbHelper helper;
	String mtablename;
	SQLiteDatabase dbr;
	SQLiteDatabase dbw;
	public BasedbOption(Context context,String tablename){
		helper=new MySqliteDbHelper(context);
		dbr=helper.getReadableDatabase();
		dbw=helper.getWritableDatabase();
		mtablename=tablename;
	}
	
	
	
	public class MySqliteDbHelper extends SQLiteOpenHelper{
		
		String initsql;
		
		public MySqliteDbHelper(Context context){
			super(context, DB_NAME, null, 1);
		}

		public MySqliteDbHelper(Context context, String name,
				CursorFactory factory, int version) {
			super(context, name, factory, version);
		}

		@Override
		public void onCreate(SQLiteDatabase db) {
			db.execSQL(INIT_TABLE_THING);
		}

		@Override
		public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
			
		}
		
	}
	
	
	public  Cursor queryObjectsByid(int id){
		StringBuilder querysql=new StringBuilder()
								.append("select * from ")
								.append(mtablename)
								.append(" where _id=?");
		String[] args=new String[]{id+""};
		Cursor c= dbr.rawQuery(querysql.toString(),args);
	
		
		return c;
	}
}
