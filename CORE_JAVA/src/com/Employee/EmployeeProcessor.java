package com.Employee;

public class EmployeeProcessor {

	public static void main(String[] args) {
	Employee emp=new Employee(2,"Vijay");
	System.out.println("employee ID : " + emp.getEmpID());
	System.out.println("EMP Name : " + emp.getName());
	System.out.println("EMP desg : " + emp.getEmpDsg());
	System.out.println("emp Salary : " + emp.getSalry());
	System.out.println("EMP Rating : " + emp.getPerformanceRating());
	System.out.println("=======================================");
	
	Employee emp3=new Employee(5,"Vinod");
	System.out.println("employee ID : " + emp3.getEmpID());
	System.out.println("EMP Name : " + emp3.getName());
	System.out.println("EMP desg : " + emp3.getEmpDsg());
	System.out.println("emp Salary : " + emp3.getSalry());
	System.out.println("EMP Rating : " + emp3.getPerformanceRating());
	System.out.println("=======================================");
	
		
		
		
		
		Employee emp1 = new Employee(3, "jayanth", "SD", 50000.0, 5);

		System.out.println("employee ID : " + emp1.getEmpID());
		System.out.println("EMP Name : " + emp1.getName());
		System.out.println("EMP desg : " + emp1.getEmpDsg());
		System.out.println("emp Salary : " + emp1.getSalry());
		System.out.println("EMP Rating : " + emp1.getPerformanceRating());
		emp1.promoteEmployee("SE");
		System.out.println("============Updated deta========");
		System.out.println("updated salary : " + emp1.getSalry());
		System.out.println("updated DESG : " + emp1.getEmpDsg());
		
		System.out.println("******************************************");
		
	Employee emp2=new Employee(4, "prasanna", "SD", 80000.0, 3);
		
		System.out.println("employee ID : " + emp2.getEmpID());
		System.out.println("EMP Name : " + emp2.getName());
		System.out.println("EMP desg : " + emp2.getEmpDsg());
		System.out.println("emp Salary : " + emp2.getSalry());
		System.out.println("EMP Rating : " + emp2.getPerformanceRating());
		emp2.promoteEmployee("SE");
		System.out.println("============Updated deta========");
		System.out.println("updated salary : " + emp2.getSalry());
		System.out.println("updated DESG : " + emp2.getEmpDsg());
		
		System.out.println("******************************************");

	}

}
