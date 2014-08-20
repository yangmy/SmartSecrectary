package com.jojo.main.activity;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class Test extends Activity{

	static int count;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		TextView text=new TextView(this);
		text.setText(""+count++);
		setContentView(text);
	}
}
