package com.lab5.test;

public class Date
{
	private int day;
	private int month;
	private int year;
	
	
	
	
	Date(int day, int month, int year)
	{
		
		if(month <=0 || month > 12)
		{
			throw new IllegalArgumentException("Month must be between 1-12");
		}
		
		if(day <=0 || day > 31)
		{
			throw new IllegalArgumentException("Day must be between 1 - 31");
		}
		
		this.setDay(day);
		this.setMonth(month);
		this.setYear(year); 
		
		}//End
	public String toString()
	{
	
		String Content = "Day: " + this.getDay() + ""  + " Month: " + this.getMonth() + " Year: " + this.getYear();
		return Content;
	
	}
	private int getDay() {
		return day;
	}
	private void setDay(int day) {
		this.day = day;
	}
	private int getMonth() {
		return month;
	}
	private void setMonth(int month) {
		this.month = month;
	}
	private int getYear() {
		return year;
	}
	private void setYear(int year) {
		this.year = year;
	}
}
