package com.company;

import com.Employee.Employee;

public class Manager {
	private String managerName;

	public Manager(String managerName) {
		super();
		this.managerName = managerName;
		System.out.println("Manager object created");
	}

	/**
	 * @return the managerName
	 */
	public String getManagerName() {
		return managerName;
	}

	/**
	 * @param managerName the managerName to set
	 */
	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	/**
	 * if employee salary 30000 then increment 15% and add current sal if employee
	 * salary 40000 then increment 10% and add current salary if employee salary
	 * 50000 thyen incriment 5% and add current salary no increment
	 * 
	 * 
	 */

	public void checkEmployeeDetails(Empolyee employee) {
		System.out.println("employee name : " + employee.getEmployeeName());
		System.out.println("employee ID : " + employee.getEmployeeId());
		System.out.println("employee desg : " + employee.getEmployeeDesg());
		System.out.println("employee salary : " + employee.getSalary());

		double salary = employee.getSalary();
		if (salary > 10000 && salary <= 30000) {
			employee.setSalary(salary + (salary * 0.15));
			

		} else if (salary > 30000 && salary <= 40000) {
			employee.setSalary(salary + (salary * 0.10));

		} else if (salary>40000) {
			employee.setSalary(salary + (salary * 0.05));

		} else {
			System.out.println("no increment");
			return;
		}
		
		System.out.println("current salary : "+employee.getSalary());

	}

}
