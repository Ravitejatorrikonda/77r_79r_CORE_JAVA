package _4_11_25;

import java.util.concurrent.ThreadPoolExecutor.DiscardOldestPolicy;

public class Example2 {
   
	String studentname="Raviteja";
	int studentId=1;
	long marks=50;
	
	public void getDetails(String stname, int stId, long mark) {
		
		studentname=stname;
		studentId=stId;
		marks=mark;
	}
	
	public String displayDetails() {
		return "Student Name : "+studentname+"Student ID : "+studentId+"student Marks : "+ marks;
	}
	
	public static void main(String[] args) {
	  Example2 obj=new Example2();
	  
	  
	  
	  obj.getDetails("Rahul", 1, 100);
	  System.out.println("Student Name : "+ obj.studentname);
	  System.out.println("Student Id : "+obj.studentId);
	  System.out.println("Student marks : "+obj.marks);
	  
	String result=obj.displayDetails();
	System.out.println(result);
	  

	}

}
