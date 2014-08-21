package com.jojo.datearrange.activity;

import java.util.ArrayList;
import java.util.List;

import com.example.smartsecrectary.R;
import com.jojo.datearrange.entity.Thing;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class ManagerDateArrangeActivity extends Activity{

	ListView thingsList;
	List<Thing> list;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.managersinglethings);
		init();
	}
	
	private void init(){
		list=getList();
		thingsList=(ListView)findViewById(R.id.Things);
		thingsList.setAdapter(new ThingsListAdapter(this, list));
		thingsList.setOnItemClickListener(new OnItemClickListener() {

			@Override
			public void onItemClick(AdapterView<?> parent, View view,
					int position, long id) {
				Thing thing=list.get(position);
				Intent intent=new Intent(ManagerDateArrangeActivity.this, EditThingActivity.class);
				intent.putExtra("thing", thing);
				startActivity(intent);
			}
		});
	}
	
	
	private List<Thing> getList() {
		ArrayList<Thing> list=new ArrayList<Thing>();
		Thing thing=new Thing();
		thing.setTitle("运动");
		thing.setDescription("每天坚持运动，健康好身体");
		list.add(thing);
		thing=new Thing();
		thing.setTitle("饮食");
		thing.setDescription("人是铁，饭是钢！");
		list.add(thing);
		
		return list;
	}


	public class ThingsListAdapter extends BaseAdapter{

		Context mContext;
		List<Thing> mlist;
		public ThingsListAdapter (Context context,List<Thing> list){
			mContext=context;
			mlist=list;
		}
		
		@Override
		public int getCount() {
			return mlist.size();
		}

		@Override
		public Object getItem(int position) {
			return mlist.get(position);
		}

		@Override
		public long getItemId(int position) {
			return position;
		}

		@Override
		public View getView(int position, View convertView, ViewGroup parent) {
			View view=null;
			if(convertView==null){
				view=getLayoutInflater().inflate(R.layout.thingslist_item, null);
			}
			else{
				view=convertView;
			}
			TextView title=(TextView) view.findViewById(R.id.title);
			TextView decription=(TextView)view.findViewById(R.id.description);
			Thing thing=(Thing) mlist.get(position);
			title.setText(thing.getTitle());
			decription.setText(thing.getDescription());
			return view;
		}
	}
}
