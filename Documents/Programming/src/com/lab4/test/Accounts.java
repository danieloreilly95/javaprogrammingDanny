package com.lab4.test;

public class Accounts implements validatedAccount
{
	private String accountName;
	private int accountNumber;
	private String sortCode;
	private String branchName;
	protected boolean inCredit;
	protected double acctBalance;
	
	
	public String getAccountName() 
	{
		return accountName;
	}
	public void setAccountName(String accountName)
	{
		this.accountName = accountName;
	}
	
	
	public int getAccountNumber() 
	{
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) 
	{
		this.accountNumber = accountNumber;
	}
	
	
	public String getSortCode()
	{
		return sortCode;
	}
	public void setSortCode(String sortCode) 
	{
		this.sortCode = sortCode;
	}
	
	
	public String getBranchName() 
	{
		return branchName;
	}
	public void setBranchName(String branchName) 
	{
		this.branchName = branchName;
	}
	
	
	public boolean isInCredit() 
	{
		return inCredit;
	}
	public void setInCredit(boolean inCredit) 
	{
		this.inCredit = inCredit;
	}
	
	
	public double getAcctBalance() {
		return acctBalance;
	}
	public void setAcctBalance(double acctBalance) 
	{
		this.acctBalance = acctBalance;
	}
	
	Accounts(double acctBalance, String accountName, int accountNumber,String sortCode,String branchName,boolean inCredit)
	{
		this.acctBalance = acctBalance;
		this.setAccountName(accountName);
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.branchName = branchName;
		this.inCredit = inCredit;
		
	}
	
	public void deposit (double amountDeposited)
	{
		acctBalance = acctBalance + amountDeposited;
	}
	
	public void withdraw(double Withdrawn)
	{
		acctBalance = acctBalance - Withdrawn;
		if(acctBalance <= 0)
		{
			inCredit = false;
		}
	}

	public void getDetails() 
	{
	
		
	}
	
	public void valuableAccount()
	{
		
		
	}
	
	

}


