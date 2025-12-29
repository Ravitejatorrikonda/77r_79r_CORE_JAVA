package com.Bank;

public class BankApplication {
	private String customerName;
	private String customerAdress;
	private long phoneNumber;
	private double balance;
	
	
	
	
	public BankApplication(String customerName, String customerAdress, long phoneNumber, double balance) {
		super();
		this.customerName = customerName;
		this.customerAdress = customerAdress;
		this.phoneNumber = phoneNumber;
		this.balance = balance;
		System.out.println("Account Created Successfully");
	}
	
	public void deposit(double ammount) {
		if(ammount <=0) {
			System.out.println("inalid ammount");
		}else {
			this.balance +=ammount;
			System.out.println("amoount deposit successfully, and updated balnce : "+balance);
		}
		
	}
	public void withdraw(double ammount) {
		if(ammount <=0) {
			System.out.println("invalid ammount");
		}
		else if(ammount>balance) {
			System.out.println("Insufficient funds");
		}else {
			this.balance -=ammount;
			System.out.println("cuurent Balance : "+this.balance);
		}
			
		
	}
	public void showbalance() {
		System.out.println("current Balance : "+this.balance);
	}
	
	
	/**
	 * @return the customerName
	 */
	public String getCustomerName() {
		return customerName;
	}
	/**
	 * @param customerName the customerName to set
	 */
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	/**
	 * @return the customerAdress
	 */
	public String getCustomerAdress() {
		return customerAdress;
	}
	/**
	 * @param customerAdress the customerAdress to set
	 */
	public void setCustomerAdress(String customerAdress) {
		this.customerAdress = customerAdress;
	}
	/**
	 * @return the phoneNumber
	 */
	public long getPhoneNumber() {
		return phoneNumber;
	}
	/**
	 * @param phoneNumber the phoneNumber to set
	 */
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	/**
	 * @return the balance
	 */
	public double getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	

}
