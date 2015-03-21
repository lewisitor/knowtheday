package org.example.knowtheday;



import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

public class Day extends Activity implements OnClickListener{

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_day);
		
	View checkButton=findViewById(R.id.check_button);
	checkButton.setOnClickListener(this);
	
	View aboutButton=findViewById(R.id.about_button);
	
	aboutButton.setOnClickListener(this);
	
	View exitButton=findViewById(R.id.exit_button);
	exitButton.setOnClickListener(this);
	
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.day, menu);
		return true;
	}

public void onClick(View v){
	switch(v.getId()){
	case R.id.check_button:
		Intent j=new Intent(this,Check.class);
		startActivity(j);
		break;
	
	case R.id.about_button:
		Intent i=new Intent(this,About.class);
		startActivity(i);
		break;
	case R.id.exit_button:
		finish();
		
	}
}
}
