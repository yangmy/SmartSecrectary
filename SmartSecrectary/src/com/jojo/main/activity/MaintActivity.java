package com.jojo.main.activity;

import com.example.smartsecrectary.R;
import com.jojo.datearrange.activity.DateArrangeActivity;

import android.app.ActionBar;
import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TabHost;

public class MaintActivity extends TabActivity{

	TabHost mTabHost;
	ActionBar actionBar;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		actionBar=getActionBar();
		actionBar.setTitle(R.string.datearrange);
		actionBar.setIcon(R.drawable.log);
		mTabHost=getTabHost();
	
		mTabHost.addTab(buildTabSpec(mTabHost, "dateArrange", "�ճ̰���", new Intent(this,DateArrangeActivity.class)));
		mTabHost.addTab(buildTabSpec(mTabHost, "clockWarn", "��ʱ����", new Intent(this,Test.class)));
		mTabHost.addTab(buildTabSpec(mTabHost, "everydayGrade", "ÿ������", new Intent(this,Test.class)));
		mTabHost.addTab(buildTabSpec(mTabHost, "personalSet", "��������", new Intent(this,Test.class)));
	
	
	}
	
	
	private TabHost.TabSpec buildTabSpec(TabHost tabhost,String tag,String indecator,Intent content){
		return tabhost.newTabSpec(tag)
				.setIndicator(indecator)
				.setContent(content);
	}
	
	
	
}
