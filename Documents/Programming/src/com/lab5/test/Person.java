package com.lab5.test;

public class Person 
{
	protected String firstName;
	private String surName;
	private Date DOB; 
	private String gender;
	
	Person(String firstName,String surName, Date DOB, String gender)
	{
		this.setFirstName(firstName);
		this.setSurName(surName);
		this.setDOB(DOB);
		this.setGender(gender);
	}

	protected String getFirstName() {
		return firstName;
	}

	private void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	protected String getSurName() {
		return surName;
	}

	private void setSurName(String surName) {
		this.surName = surName;
	}

	protected Date getDOB() {
		return DOB;
	}

	private void setDOB(Date dOB) {
		DOB = dOB;
	}

	protected String getGender() {
		return gender;
	}

	private void setGender(String gender) {
		this.gender = gender;
	}
	
	
	
}

