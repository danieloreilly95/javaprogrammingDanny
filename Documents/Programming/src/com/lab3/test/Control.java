package com.lab3.test;

public class Control 
{
	public static void main(String args[])
	{
	
		Employee employ1 = new Employee("Danny", "O Reilly",123,12.50,"10-Feb");
		HourlyEmployee employ2 = new HourlyEmployee("April","Tan",123,11.50,"11-Feb",16.0,11.5);
		CommisionEmployee employ3 = new CommisionEmployee("Yassr","Shar",123,12.50,"11-Feb",4);
		
		System.out.println(employ1.toString());
		System.out.println(employ2.toString());
		System.out.println(employ3.toString());
		
		Employee[] myEmployees = new Employee[6];
		myEmployees[0] = new Employee("Danny", "O Reilly",123,0,"10-Feb");
		myEmployees[1] = new Employee("Danny", "O Reilly",123,0,"10-Feb");
		myEmployees[2] = new HourlyEmployee("Danny", "O Reilly",123,0,"10-Feb",16.0,11.5);
		myEmployees[3] = new HourlyEmployee("Danny", "O Reilly",123,0,"10-Feb",16.0,12.5);
		myEmployees[4] = new CommisionEmployee("Danny", "O Reilly",123,0,"10-Feb",4);
		myEmployees[5] = new CommisionEmployee("Danny", "O Reilly",123,0,"10-Feb",4);
		
		for(int i=0; i<myEmployees.length; i++)
		{
			System.out.println(myEmployees[i].calculatePay());
		
		}
		
	}

}
