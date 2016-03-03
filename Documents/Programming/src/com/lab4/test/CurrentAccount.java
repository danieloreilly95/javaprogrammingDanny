package com.lab4.test;

public class CurrentAccount extends Accounts
{
	
	private double penaltyAmmount;
	

	CurrentAccount(double acctBalance, String accountName, int accountNumber, String sortCode, String branchName,
			boolean inCredit, double penaltyAmount) 
	{
		super(acctBalance, accountName, accountNumber, sortCode, branchName, inCredit);
		
	}
	
	public void withdraw(double Withdrawn)
	{
		if(acctBalance < Withdrawn)
		{
			System.out.println("Insufficient Funds");
		}
		else
		{
			acctBalance = acctBalance - Withdrawn;
			if(acctBalance < 0)
			{
				inCredit = false;
			}
		}
	}
	
	String CheckCredit()
	{
		String message;
		if(inCredit == true)
		{
			return message = "Account is in credit";
		}
		else 
		{
			return message = "Account is not in credit";
		}
	}
	
	void CheckCredit(String warning)
	{
		if(acctBalance <100 & acctBalance > 0)
		{
			System.out.println(warning);
		}
	}

	public double getPenaltyAmmount() {
		return penaltyAmmount;
	}

	public void setPenaltyAmmount(double penaltyAmmount) {
		this.penaltyAmmount = penaltyAmmount;
	}

}
