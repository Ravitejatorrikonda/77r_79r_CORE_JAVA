package com.bankapplication.main;

import com.bankapplication.BankAccount;

public class BankProcessor {

	public static void main(String[] args) {
	BankAccount obj1=new BankAccount(1234, "harshitha", 30000.0);
	System.out.println(obj1.getAccountHolder());
	System.out.println(obj1.getAccountNumber());
	System.out.println(obj1.getBalance());
	obj1.deposit(0.0);
	System.out.println("updated balance : "+ obj1.getBalance());
	
	System.out.println("======================================");
	obj1.withdraw(0.0);
	System.out.println(obj1.getBalance());

	}
	
	


}
