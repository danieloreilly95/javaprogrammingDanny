package com.lab5.test;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Job
{
	private double salary;
	private String role;
	private int ID;
	File RolesFile;
	Scanner MyScanner;
	void getFile()
	{
		try
		{
			RolesFile = new File("Roles.txt");
			MyScanner = new Scanner (RolesFile);
		}
		catch (FileNotFoundException e)
		{
			System.out.println(e);
		}
		
				
		
	}
	Job(double salary, String role, int ID)
	{
		this.setSalary(salary);
		this.setRole(role);
		this.setID(ID);
	}

	public String toString()
	{
	
		String Content = "Salary: " + this.getSalary() + ""  + " Role: " + this.getRole() + " ID: " + this.getID();
		return Content;
	}

	private double getSalary() {
		return salary;
	}

	private void setSalary(double salary) {
		this.salary = salary;
	}

	private String getRole() {
		return role;
	}

	private void setRole(String role) {
		this.role = role;
	}

	private int getID() {
		return ID;
	}

	private void setID(int iD) {
		ID = iD;
	}
	

}
