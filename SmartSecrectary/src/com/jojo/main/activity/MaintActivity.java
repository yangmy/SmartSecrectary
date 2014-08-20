package com.jojo.main.activity;

import com.example.smartsecrectary.R;
import com.jojo.dayarrange.activity.DateArrangeActivity;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class MaintActivity extends TabActivity{

	TabHost mTabHost;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.main_activity);
		mTabHost=getTabHost();
	
		mTabHost.addTab(buildTabSpec(mTabHost, "dayArrange", "�ճ̰���", new Intent(this,DateArrangeActivity.class)));
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
