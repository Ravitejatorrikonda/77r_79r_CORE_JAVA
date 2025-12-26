package com.scanner;
import java.util.Scanner;

public class Example3 {
	
	/**
	 * write a java progrqam for form validation
	 *  and takes input from the user
	 *  
	 *  i/p:-  user Name : admin
	 *        user password : admin@123
	 *  0/p:-    login successfull
	 *  
	 *  i/p:-   user Name : user
	 *        user password : user@123
	 *  0/p:-    login failed
	 *          you have only 2 attempts left
	 *          
	 *          
	 *   
	 * 
	 * 
	 * 
	 * 
	 */


	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		
		int attempts=0;
		do {
			System.out.println("Enter UserName : ");
			String name=scanner.next();
			System.out.println("Enter password : ");
			String password=scanner.next();
			if(name.equals("admin") && password.equals("admin@123")) {
				System.out.println("Login successfull");
				break;
			}
			else {
				attempts++;
				System.out.println("Login failed "+(3-attempts)+"attempts left");
			}
		}while(attempts<3);
		
		if(attempts==3) {
			System.out.println("you have login after 24 hours");
		}
		
		
		
		
		
		scanner.close();
		
		
		
		
		

	}

}
