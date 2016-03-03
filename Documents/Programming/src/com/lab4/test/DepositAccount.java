package com.lab4.test;

public class DepositAccount extends Accounts
{
	private double interestRate;

	DepositAccount(double acctBalance, String accountName, int accountNumber, String sortCode, String branchName,
			boolean inCredit,int PenaltyAmount, double interestRate) 
	{
		super(acctBalance, accountName, accountNumber, sortCode, branchName, inCredit);

	}
	
	public void withdraw()
	{
		System.out.println("You cannot withdraw from a deposit account.");
	}
	
	public void deposit (double amountDeposited)
	{
		acctBalance = acctBalance + amountDeposited;
	}

	public double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(double interestRate) {
		this.interestRate = interestRate;
	}
	

}