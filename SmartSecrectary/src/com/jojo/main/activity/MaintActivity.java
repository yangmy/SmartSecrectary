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
	
		mTabHost.addTab(buildTabSpec(mTabHost, "dateArrange", "日程安排", new Intent(this,DateArrangeActivity.class)));
		mTabHost.addTab(buildTabSpec(mTabHost, "clockWarn", "定时提醒", new Intent(this,Test.class)));
		mTabHost.addTab(buildTabSpec(mTabHost, "everydayGrade", "每日评分", new Intent(this,Test.class)));
		mTabHost.addTab(buildTabSpec(mTabHost, "personalSet", "个人设置", new Intent(this,Test.class)));
	
	
	}
	
	
	private TabHost.TabSpec buildTabSpec(TabHost tabhost,String tag,String indecator,Intent content){
		return tabhost.newTabSpec(tag)
				.setIndicator(indecator)
				.setContent(content);
	}
	
	
	
}
