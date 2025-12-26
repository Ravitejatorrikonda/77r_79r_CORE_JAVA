package com.scanner;
import java.util.Scanner;

public class Example2 {
	/**
	 * write a java program to check the eligibility of marriagex
	 * 
	 * if age 23 above and gender is female or age > 27 and gender is male
	 * eligible for voting
	 * else
	 * not eligible
	 * 
	 * 
	 * 
	 */

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		System.out.println("Enter age : ");
		int age=scanner.nextInt();
		System.out.println("Enter Gender  : ");
	
		
		String gender=scanner.next();
		if((age >=23 && gender.equals("female")) || (age >= 27 && gender.equals("male"))) {
			System.out.println("Eligible for votting");
		}else {
			System.out.println("! Eligible");
		}
		
		
		
		
		scanner.close();
		
		
		
		
		

	}

}
