package com.lab3.test;

public class Employee 
{
	private String firstName;
	private String surName;
	private int StaffNumber;
	private double baseAnnualSalary = 0;
	private String startDate;
	
	Employee(String firstName, String surName, int StaffNumber, double baseAnnualSalary, String startDate)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setStaffNumber(StaffNumber);
		this.setBaseAnnualSalary(baseAnnualSalary);
		this.setStartDate(startDate);
	}
	
	public double calculatePay()
	{
		
		return this.baseAnnualSalary/12;
	}

	public String getSurName() {
		return surName;
	}

	public void setSurName(String surName) {
		this.surName = surName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public int getStaffNumber() {
		return StaffNumber;
	}

	public void setStaffNumber(int staffNumber) {
		StaffNumber = staffNumber;
	}

	public double getBaseAnnualSalary() {
		return baseAnnualSalary;
	}

	public void setBaseAnnualSalary(double baseAnnualSalary) {
		this.baseAnnualSalary = baseAnnualSalary;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}
	
	public String toString()
	{
		String Content = "Name: " + this.firstName + " " + this.surName + ". Staff Number: " + this.StaffNumber + ". Base Annual Salary: " + this.baseAnnualSalary;
		return Content;
	}
}
