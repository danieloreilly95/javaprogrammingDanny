package com.lab3.test;

public class CommisionEmployee extends Employee
{
	private double commissionEarned;
	
	CommisionEmployee(String firstName, String surName, int StaffNumber, double baseAnnualSalary, String startDate, double commissionEarned) 
	{
		super(firstName, surName, StaffNumber, baseAnnualSalary, startDate);
		
	}
	
	public double calculatePay()
	{
		return super.getBaseAnnualSalary()/12+commissionEarned;
	}

	public double getCommissionEarned() {
		return commissionEarned;
	}

	public void setCommissionEarned(double commissionEarned) {
		this.commissionEarned = commissionEarned;
	}
	
	public String toString()
	{
		String Content = "Name: " + super.getFirstName() + " " + super.getSurName() + ". Staff Number: "+super.getStaffNumber() + ". Base Annual Salary: "+ super.getBaseAnnualSalary() +". Commission Earned: "+ this.commissionEarned;
		return Content;
	}

}
