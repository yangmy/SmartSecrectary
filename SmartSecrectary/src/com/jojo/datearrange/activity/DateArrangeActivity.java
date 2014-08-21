package com.jojo.datearrange.activity;

import com.example.smartsecrectary.R;

import android.app.ActionBar;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DateArrangeActivity extends Activity{

	LinearLayout managersinglethings;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.datearrange);
		init();
	}
	
	
	private void init(){
		managersinglethings=(LinearLayout)findViewById(R.id.managersinglethings);
		managersinglethings.setOnClickListener(
				new DateArrangeItemOnClickListener(new Intent(this, ManagerDateArrangeActivity.class)));
		
	}
	
	class DateArrangeItemOnClickListener implements View.OnClickListener{

		Intent mintent;
		public DateArrangeItemOnClickListener(Intent intent){
			mintent=intent;
		}

		@Override
		public void onClick(View v) {
			if(mintent!=null){
				startActivity(mintent);
			}
		}
	}
}
