package com.lab3.test;

public class HourlyEmployee extends Employee
{
	private double hoursWorked;
	private double hoursPaid;

	
	HourlyEmployee(String firstName, String surName, int StaffNumber, double baseAnnualSalary, String startDate, double hoursWorked, double hoursPaid) 
	{
		super(firstName, surName, StaffNumber, 0 , startDate);
		this.setHoursWorked(hoursWorked);
		this.setHoursPaid(hoursPaid);
			
		
		
	}
	
	public double calculatePay()
	{
		return this.hoursWorked*this.hoursPaid;
		
	}

	public double getHoursWorked() {
		return hoursWorked;
	}

	public void setHoursWorked(double hoursWorked) {
		this.hoursWorked = hoursWorked;
	}

	public double getHoursPaid() {
		return hoursPaid;
	}

	public void setHoursPaid(double hoursPaid) {
		this.hoursPaid = hoursPaid;
	}
	
	public String toString()
	{
		String Content = "Name: " + super.getFirstName()+ " " + super.getSurName() + " Staff number: " + super.getStaffNumber() + ". Base Annual Salary: " + super.getBaseAnnualSalary()+ ". Hourly Rate: " + this.hoursPaid + ". Hours Worked: " + this.hoursWorked;
		return Content;
	}
}
