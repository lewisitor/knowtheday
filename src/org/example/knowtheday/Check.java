package org.example.knowtheday;


import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.view.Menu;
//import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class Check extends Activity implements OnClickListener{
	String day_string,year_string,month_string,century_string,year_super;
	int day_int,century_int,deal_day_sub,deal_day,year_int,month_int,day_offset,year_offset_u,year_offset,month_offset,century_offset;
	  
	 private Button validatebtn;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	super.onCreate(savedInstanceState);
	setContentView(R.layout.check_day);
	View day_edit,month_edit,year_edit;
	day_edit=null;
	month_edit=null;
	year_edit=null;
	 day_edit=(EditText)findViewById(R.id.editday);
	 month_edit=(EditText)findViewById(R.id.editmonth);
	 year_edit=(EditText)findViewById(R.id.edityear);
	
	//Resources myres=getResources();
	validatebtn=(Button)findViewById(R.id.validate);
	validatebtn.setOnClickListener(this);
	
	}
	
	/*public void name(View v){
		 EditText result=null;
		 day_offset=0;
		 day_int=0;
		 year_int=0;
		 century_int=0;
		 month_int=0;
		 year_offset=0;
		try{
		  result=(EditText)findViewById(R.id.resultlog);	
		//retrievx the vals stored in the EditText
		}
		catch(Exception ex){
			Toast.makeText(this, "TextView not found", Toast.LENGTH_LONG).show();
		}
		try{
		day_string=day_edit.getText().toString();
		year_super=year_edit.getText().toString();
		month_string=month_edit.getText().toString();
		//separatx the vals of the year super
		century_string=year_super.substring(0,2);
		year_string=year_super.substring(2);
		
		//parsx the strings to obtain their int values
		day_int=Integer.parseInt(day_string);
		century_int=Integer.parseInt(century_string);
		year_int=Integer.parseInt(year_string);
		month_int=Integer.parseInt(month_string);
		
		day_offset=day_int % 7;
		year_offset=(int)(year_int + (year_int/4));
		
		Calculate lewis=new Calculate();
	
		century_offset=(lewis.nextmult(century_int)-1)-((century_int))*2;
		month_offset=lewis.monthoffset(month_int);
		deal_day=day_offset+day_offset+century_offset + month_offset;
		
		//result.setText(String.format("Your inputed Day appears to be on a %s\n", lewis.seeday(deal_day)));
		result.setText("Hello");
		Toast.makeText(this, "Not really", Toast.LENGTH_LONG).show();
		}
		catch(Exception en){
			Toast.makeText(this, "Could not be read",Toast.LENGTH_LONG).show();
			
		}
		}*/
	
	@Override
	public void onClick(View v){
			 EditText result=null;
			 EditText day_edit=null;
			 EditText month_edit=null;
			 EditText year_edit=null;
		 day_offset=0;
		 day_int=0;
		 year_int=0;
		 century_int=0;
		 month_int=0;
		 year_offset=0;
		 deal_day=0;
		try{
		  result=(EditText)findViewById(R.id.resultlog);	
			 day_edit=(EditText)findViewById(R.id.editday);
			 month_edit=(EditText)findViewById(R.id.editmonth);
			 year_edit=(EditText)findViewById(R.id.edityear);
		//retrievx the vals stored in the EditText
		}
		catch(Exception ex){
			Toast.makeText(this, "TextView not found", Toast.LENGTH_LONG).show();
		}
		try{
			//result.setText("Hello");
			//day_string="Hello Lewis";
			
		day_string=day_edit.getText().toString();
		//result.setText(String.format("%s", day_string));
		year_super=year_edit.getText().toString();
		month_string=month_edit.getText().toString();
		//separatx the vals of the year super
	
		century_string=year_super.substring(0,2);
		year_string=year_super.substring(2);
		
		//parsx the strings to obtain their int values
		day_int=Integer.parseInt(day_string);
		century_int=Integer.parseInt(century_string);
		year_int=Integer.parseInt(year_string);
		month_int=Integer.parseInt(month_string);
		
	//	result.setText(String.format("%d", month_int));
		
	//	result.setText("Hello");
		
		day_offset=day_int % 7;
		year_offset_u=(int)(year_int) + (year_int/4);
		year_offset=year_offset_u %7 ;
		
		
		Calculate lewis=new Calculate();
	
		century_offset=((lewis.nextmult(century_int)-1)-(century_int))*2;
		//century_offset=lewis.nextmult(century_int);
	//	result.setText(String.format("%d", century_offset));
		lewis.set_monthoffset(month_int);
		month_offset=lewis.see_month_offset();
		//result.setText(String.format("%d", month_offset));
		deal_day_sub=day_offset+year_offset+century_offset + month_offset;
		deal_day=deal_day_sub % 7;
		//result.setText(String.format("%d",deal_day));
		result.setText(String.format("The inputed date is on %s\n", lewis.seeday(deal_day)));
		//result.setText("Hello");
		//Toast.makeText(this, "Not really", Toast.LENGTH_LONG).show();
		}
	
		catch(Exception en){
			Toast.makeText(this, "Could not be read",Toast.LENGTH_LONG).show();
			
	
		}}
	@Override
	public void onResume(){
		onCreate(null);
	}
}
