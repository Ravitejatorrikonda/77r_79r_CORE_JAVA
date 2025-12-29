package com.company;

public class Empolyee {
  private String employeeName;
  private int employeeId;
  private String employeeDesg;
  private double salary;
  
  
  
  
  public Empolyee(String employeeName, int employeeId, String employeeDesg, double salary) {
	
	this.employeeName = employeeName;
	this.employeeId = employeeId;
	this.employeeDesg = employeeDesg;
	this.salary = salary;
	System.out.println("Employee object created");
}
  /**
   * @return the employeeName
   */
  public String getEmployeeName() {
	return employeeName;
  }
  /**
   * @param employeeName the employeeName to set
   */
  public void setEmployeeName(String employeeName) {
	this.employeeName = employeeName;
  }
  /**
   * @return the employeeId
   */
  public int getEmployeeId() {
	return employeeId;
  }
  /**
   * @param employeeId the employeeId to set
   */
  public void setEmployeeId(int employeeId) {
	this.employeeId = employeeId;
  }
  /**
   * @return the employeeDesg
   */
  public String getEmployeeDesg() {
	return employeeDesg;
  }
  /**
   * @param employeeDesg the employeeDesg to set
   */
  public void setEmployeeDesg(String employeeDesg) {
	this.employeeDesg = employeeDesg;
  }
  /**
   * @return the salary
   */
  public double getSalary() {
	return salary;
  }
  /**
   * @param salary the salary to set
   */
  public void setSalary(double salary) {
	this.salary = salary;
  }
  
  
  
}
