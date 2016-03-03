package com.lab4.test;

public class Control 
{
	public static void main(String args[])
	{
		
		CurrentAccount account1 = new CurrentAccount(5550.00,"Daniel O Reilly", 765849, "AIBKE2", "AIB", true,0);
		Accounts account2 = new Accounts(5600.00,"Andrew Breen", 23734773, "AIBKE2", "AIB", true);
		DepositAccount account3 = new DepositAccount(5700.00,"Tom Alexander", 23738773, "AIBKE2", "AIB", true,0,0.12);
		System.out.println(account1.acctBalance);
		System.out.println(account2.acctBalance);	
		System.out.println(account3.acctBalance);	
		System.out.println(account1.getAccountName());	
		account1.withdraw(5000);
		System.out.println(account1.acctBalance);
		
	}

}
