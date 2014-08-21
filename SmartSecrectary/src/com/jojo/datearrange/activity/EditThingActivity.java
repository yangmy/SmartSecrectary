package com.jojo.datearrange.activity;

import com.example.smartsecrectary.R;
import com.jojo.datearrange.entity.Thing;

import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;

public class EditThingActivity extends Activity{

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.editthing);
		Thing thing=(Thing) getIntent().getSerializableExtra("thing");
		init();
		title.setText(thing.getTitle());
		description.setText(thing.getDescription());
	}
	
	EditText title,description;
	private void init(){
		title=(EditText) findViewById(R.id.title);
		description =(EditText)findViewById(R.id.description);
	}
}
