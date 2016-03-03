package com.lab5.test;

public class Employee extends Person
{
	private Job Job;
	private static int currentNum = 100;
	private Date startDate;
	private int persNum;

	Employee(String firstName, String surName, Date DOB, String gender, Job Job, int persNum, Date startDate) 
	{
		super(firstName, surName, DOB, gender);
		this.setJob(Job);
		this.setPersNum(getCurrentNum());
		setCurrentNum(getCurrentNum() + 1);
		this.setStartDate(startDate);
		
	}

	private Job getJob()
	{
		return Job;
	}

	private void setJob(Job job) {
		Job = job;
	}

	protected static int getCurrentNum() {
		return currentNum;
	}

	protected static void setCurrentNum(int currentNum) {
		Employee.currentNum = currentNum;
	}

	private Date getStartDate() {
		return startDate;
	}

	private void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	
	private int getPersNum() {
		return persNum;
	}

	private void setPersNum(int persNum) {
		this.persNum = persNum;
	}

	public String toString()
	{
	
		String Content = "Name: " + getFirstName() + getSurName() + "DOB: " + getDOB() + "" + "Gender: " + getGender() 
		+ "Job: " + getJob() + "Start Date: " + getStartDate()  + "Personnel Number: " + getPersNum();
		return Content;
	}
}
/*
	String myFileName = "names.txt";
	 try
	 {
	 PrintWriter myOutFile = new PrintWriter(myFileName);
	 myOutFile.println("here’s my first line");
	 myOutFile.println("and another");
	 myOutFile.close();
	 }
	
	 catch(Exception ex) 
	{
	 System.out.println("exception "+ex.getMessage()+"caught");
	}

*/
	

