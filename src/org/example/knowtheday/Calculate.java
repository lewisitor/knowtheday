package org.example.knowtheday;

public class Calculate {

	String string_Century,string_year;

	private int int_year,month,day,int_Century,next_mult;
	
	private String weekday,sendyear;
	private int value,century_offset,day_offset,year_mod;
	
	
	public   void set_monthoffset(int month){
	
		this.value=0;
		switch(month){
		case 1:
		this.value=0;
		
		break;
		
		case 2:
		this.value=3;
		break;
		
		case 3:
		this.value=3;
		break;
		
		case 4:
		this.value=6;
		break;
		
		case 5:
		this.value=1;
		break;
		
		case 6:
		this.value=4;
		break;
		
		case 7:
		this.value=6;
		break;
		
		case 8:
		this.value=2;
		break;
		
		case 9:
		this.value=5;
		break;
		
		case 10:
		this.value=0;
		break;
		
		case 11:
		this.value=3;
		break;
		
		case 12:
		this.value=5;
		break;	
	default:
		this.value=0;
		break;
		}

	}
	
	public int see_month_offset(){
		
		return this.value;
	}

	public void splityear(String sendyear){
		string_Century=sendyear.substring(0, 2);
		this.int_Century=Integer.parseInt(string_Century);
		string_year=sendyear.substring(2);
		this.int_year=Integer.parseInt(string_year);
	}
	
	public void setDay(int day){
		this.day=day;
	}
	public int getDay(){
		return this.day;
	}
	
	public String seeday(int dealday){
		int hold1=0;
		this.weekday=null;
		//dealday=centuryoffset() + monthoffset() + yearoffset() + dayoffset();
		if(dealday < 7){
			switch(dealday){
			case 0:
				this.weekday="Sunday";
			break;
			case 1:
				this.weekday="Monday";
				break;
			case 2:
				this.weekday="Tuesday";
				break;
			case 3:
				this.weekday="Wednesday";
				break;
			case 4:
				this.weekday="Thursday";
				break;
			case 5:
				this.weekday="Friday";
				break;
			case 6:
				this.weekday="Saturday";
				break;
			}
			return this.weekday;
		}
		else{
			hold1=dealday % 7;
		
			switch(hold1){
			case 0:
				this.weekday="Sunday";
			break;
			case 1:
				this.weekday="Monday";
				break;
			case 2:
				this.weekday="Tuesday";
				break;
			case 3:
				this.weekday="Wednesday";
				break;
			case 4:
				this.weekday="Thursday";
				break;
			case 5:
				this.weekday="Friday";
				break;
			case 6:
				this.weekday="Saturday";
				break;
			}
			return this.weekday;
		}
		}
	
	//method to calc the century offset
	/*public int centuryoffset(){
		int hold1,hold2;
		hold1=0;
		hold2=0;
		hold1=(nextmult()-1);
		hold2=(hold1-this.int_Century);
		this.century_offset=(hold2)*2;
		return this.century_offset;
	}*/
	public int yearoffset(){
		int year=0;
		year=(int_year) + (int_year/4);
		
		this.year_mod=year % 7;
		return this.year_mod;
	}
	//to calc the day offset
	public int dayoffset(){
		
		this.day_offset=getDay() % 7;
		return this.day_offset;
	}
	//this method will be used to calc the nextmult
	public int nextmult(int int_century){
		this.next_mult=0;
		if(int_century % 4 == 0 ){
			int_century+=4;
			this.next_mult=int_century;
		}
		else{
			if(0 < int_century && int_century < 4){
				this.next_mult=4;
			}
			else if(4 < int_century && int_century < 8){
				this.next_mult=8;
			}
			else if(8 < int_century && int_century < 12){
				this.next_mult=12;
				
			}
			else if(12 < int_century && int_century < 16){
				this.next_mult=16;
			}
			else if(16 < int_century && int_century < 20){
				this.next_mult=20;
			}
			else if(20 < int_century && int_century < 24){
				this.next_mult=24;
			}
			else if(24 < int_century && int_century < 28){
				this.next_mult=28;
			}
			else if(28 < int_century && int_century < 32){
				this.next_mult=32;
			}
			
			
		}
		return this.next_mult;
	}
	
}
