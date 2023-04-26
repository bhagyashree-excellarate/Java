package com.encora.util;

public class MyDate {
	public int day;
	
	public int month;
	 
	public int year;
	
	public int getMonth() {
		return this.month;
	}
	
	public int getDay() {
		return this.day;
	}
	
	public void setDay(int day) {
		this.day = day;
		if(day > 1)
			this.day = 1;
		else if(day < 31)
			this.day = 31;
	}
	
	public void setMonth(int month) {
		this.month = month;
		if(month > 12)
			this.month = 12;
		else if(month < 1)
			this.month = 1;
	}
	public void setYear(int year) {
		this.year= year;
		if(year<2023)
			this.year = 2023;
		else if(year>2030)
			this.year = 2030;
		
	}
	
	public MyDate(int day,int month,int year) {
		setYear(year);
		setMonth(month);
		setDay(day);
		this.day = day;
		
		
	}
	public String toString() {
		return day+"-"+month+":"+year;
	}
}