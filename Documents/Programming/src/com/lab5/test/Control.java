package com.lab5.test;

public class Control 
{
	public static void main(String Args[])
	{
		Date date1 = new Date(10,02,2016);
		System.out.println(date1.toString());
		
		Job DanielJob = new Job(26000,"Accountant",123456);
		System.out.println(DanielJob.toString());
		
		Date DanielDOB = new Date(10,02,1995);
		Date startDate = new Date(28,02,2015);
		
		Employee employ1 = new Employee("Daniel","O'Reilly",DanielDOB,"Male",DanielJob,101,startDate);
		System.out.println(employ1.toString());
		Employee employ2 = new Employee("D","O'R",DanielDOB,"Male",DanielJob,101,startDate);
		System.out.println(employ2.toString());
	}

}
