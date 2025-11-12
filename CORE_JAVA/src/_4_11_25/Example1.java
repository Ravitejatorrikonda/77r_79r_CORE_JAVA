package _4_11_25;

public class Example1 {

	String empName;
	String empDesg;
	double empSalary;
	
	public void displayDetails() {
		
		
		
		System.out.println("employee Name : "+empName);
		System.out.println("employee Desg : "+empDesg);
		System.out.println("employee Salary : "+empSalary);
	
	}
	
	public static void main(String[] args) {
		Example1 obj1= new Example1();
		Example1 obj2=new Example1();
		
		obj1.empName="Suresh";
		obj1.empDesg="SE";
		obj1.empSalary=45000.0;
		obj1.displayDetails();
		System.out.println("------------------");
		obj2.empName="Rajesh";
		obj2.empDesg="SE";
		obj2.empSalary=50000.0;
		obj2.displayDetails();
				
		
		

	}

}
