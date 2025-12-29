package com.company;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	   Scanner scanner=new Scanner(System.in);
	   System.out.println("Enter employeeName :");
	   String name=scanner.nextLine();
	   System.out.println("Enter employee ID : ");
	   int id=scanner.nextInt();
	   
	   scanner.nextLine();
	   
	   System.out.println("Enter employeeDesg : ");
	   String desg=scanner.nextLine();
	   System.out.println("Enter Salary : ");
	   double salary=scanner.nextDouble();
	   Empolyee employee=new Empolyee(name, id, desg, salary);
	   scanner.nextLine();
	   
	   System.out.println("EnterManager Name : ");
	   String managerName=scanner.nextLine();
	   
	   Manager manager=new Manager(managerName);
	   
	   manager.checkEmployeeDetails(employee);
	   
	   scanner.close();
	}

}
