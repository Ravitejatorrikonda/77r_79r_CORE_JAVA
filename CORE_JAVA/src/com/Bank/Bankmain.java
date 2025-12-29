package com.Bank;

import java.util.Scanner;

public class Bankmain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter username :");
		String name = scanner.nextLine();
		System.out.println("Enter User Adress : ");
		String adress = scanner.nextLine();
		System.out.println("Enter phone Number : ");
		long phonenumber = scanner.nextLong();
		System.out.println("Enter intial deposit balance : ");
		double ammount = scanner.nextDouble();
		BankApplication application = new BankApplication(name, adress, phonenumber, ammount);

		System.out.println("*Select Options from below*\r\n" + "\r\n" + "1. withdraw\r\n" + "\r\n" + "2. deposit\r\n"
				+ "\r\n" + "3. showBalance\r\n" + "\r\n" + "4. exit\r\n" + "\r\n" + "Enter your option [1-4]:");

		boolean status=true;
		
		while(status) {
			int options = scanner.nextInt();
			switch (options) {
			case 1: {
				System.out.println("Enter withdraw ammount : ");
				double amount=scanner.nextDouble();
				application.withdraw(amount);
				System.out.println("withdraw successfully : ");
				break;
				
			}
			case 2:{
				System.out.println("Enter deposit ammount : ");
				double amount=scanner.nextDouble();
				application.deposit(amount);
				
				break;
			}
			case 3:{
				application.showbalance();
			}
			case 4:{
				System.out.println("Thank you !");
				status=false;
				break;
			}
			default:
				System.out.println("incvalid options");
			}
		}

		scanner.close();

	}

}
