package _05_11_25;

public class Example3 {
   String empName;
   String empDesg;
   double empSal;
   int empId;
   
   public String getempName() {
	   return empName;
   }
   public void setempName(String name) {
	   empName=name;
   }
   public String getempDesg(){
	   return empDesg;
   }
   public void setempDesg(String desg) {
	   empDesg=desg;
   }
   public double getempSal() {
	   return empSal;
   }
   public void setempSal(double sal) {
	   empSal=sal;
   }
   public int getempId() {
	   return empId;
   }
   public void setempId(int id) {
	   empId=id;
   }
   
	public static void main(String[] args) {
		Example3 obj1=new Example3();
		obj1.setempName("Sruthi");
		obj1.setempDesg("SD");
		obj1.setempSal(45000.0);
		obj1.setempId(1);
		
		System.out.println("Employee Name : "+obj1.getempName());
		System.out.println("Employee Desg : "+obj1.getempDesg());
		System.out.println("Employee Salary : "+obj1.getempSal());
		System.out.println("Employee ID : "+obj1.getempId());
		System.out.println("----------------obj2---------------------");
		Example3 obj2=new Example3();
		obj2.setempName("Udaysri");
		obj2.setempDesg("SE");
		obj2.setempSal(50000.0);
		obj2.setempId(2);
		System.out.println("Employee Name : "+obj2.getempName());
		System.out.println("Employee Desg : "+obj2.getempDesg());
		System.out.println("Employee Salary : "+obj2.getempSal());
		System.out.println("Employee ID : "+obj2.getempId());
	}

}
