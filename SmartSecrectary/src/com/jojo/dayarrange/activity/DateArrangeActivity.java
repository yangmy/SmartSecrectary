package com.jojo.dayarrange.activity;

import com.example.smartsecrectary.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class DateArrangeActivity extends Activity{

	LinearLayout createDateArrange;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.dayarrange);
		
	}
	
	private void init(){
		createDateArrange=(LinearLayout)findViewById(R.id.createdatearrange);
		createDateArrange.setOnClickListener(
				new DateArrangeItemOnClickListener(new Intent(this, NewDateArrangeActivity.class)));
		
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
