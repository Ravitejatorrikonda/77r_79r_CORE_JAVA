package com.Employee;

import java.beans.DesignMode;

public class Employee {
	private int empID;
	private String name;
	private String empDsg;
	private double salry;
	private int performanceRating;
	
	public Employee() {}
	public Employee(int empID, String name) {
		this.empID=empID;
		this.name=name;
		empDsg="juniour SD";
		salry=20000.0;
		performanceRating=2;
		
	}
	
	public Employee(int empID, String name, 
			String empDsg, double salry, int performanceRating) {
		
		this.empID=empID;
		this.name=name;
		this.empDsg=empDsg;
		this.salry=salry;
		this.performanceRating=performanceRating;
		
	}

	public int getEmpID() {
		return empID;
	}

	public String getName() {
		return name;
	}

	public String getEmpDsg() {
		return empDsg;
	}

	public double getSalry() {
		return salry;
	}

	public int getPerformanceRating() {
		return performanceRating;
	}
	
	//setters

//	public void setEmpID(int empID) {
//		this.empID = empID;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public void setEmpDsg(String empDsg) {
//		this.empDsg = empDsg;
//	}

//	public void setSalry(double salry) {
//		this.salry = salry;
//	}

	public void setPerformanceRating(int performanceRating) {
		this.performanceRating = performanceRating;
	}
	
	public void promoteEmployee(String newDesignation) {
		if(performanceRating>=4) {
			//50000=   50000*20%=4000
			salry +=(salry*0.2);
			this.empDsg=newDesignation;
			System.out.println("salary has been hiked");
			
		}else {
			System.out.println("no pramotion");
		}
	}
	
	
	

}
