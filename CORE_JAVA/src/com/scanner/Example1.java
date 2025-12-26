package com.scanner;

import java.util.Scanner;
/**
 * takes inputs from the user and print the details
 * name,adress,pincode,phonenumber
 * 
 * 
 */

public class Example1 {
	public void displayDetails(String name, String adress, int pincode, long num) {
		System.out.println("your name is : "+name);
		System.out.println("your adress is : "+adress);
		System.out.println("your pincode is : "+pincode);
		System.out.println("your number is : "+num);
		
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Name : ");
		String name=scanner.next();
		System.out.println("Enter adress : ");
		String adress=scanner.next();
		System.out.println("Enter pincode : ");
		int pincode=scanner.nextInt();
		System.out.println("Enter phone number : ");
		long phonenumber=scanner.nextLong();
		
		new Example1().displayDetails(name, adress, pincode, phonenumber);
		
		

		scanner.close();

	}

}
