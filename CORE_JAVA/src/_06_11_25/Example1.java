package _06_11_25;

public class Example1 {

	String studentName;
	long studentId;
	String studentBranch;
	String studentCollege;
	
	
	
	
	public String getStudentName() {
		return studentName;
	}


	public long getStudentId() {
		return studentId;
	}


	public String getStudentBranch() {
		return studentBranch;
	}


	public String getStudentCollege() {
		return studentCollege;
	}
	
	public void setStdentName(String name) {
		studentName=name;
	}
	public void setStudentID(long id) {
		studentId=id;
	}
	public void setStudentBranch(String branch) {
		studentBranch=branch;
	}
	public void setStdentCollege(String college) {
		studentCollege=college;
	}


	public String displayData() {
		return "Studentname : "+studentName+"\nStudentId : "+ studentId+"\nstudentBranch : "+studentBranch+"\nstrudentCollege : "+studentCollege;
	}
	
	
	public static void main(String[] args) {
	Example1 obj=new Example1();
	
	obj.setStdentName("Peeter");
	obj.setStudentID(34);
	obj.setStudentBranch("CSE");
	obj.setStdentCollege("Vinodh univercity");
	
	System.out.println(obj.displayData());
	System.out.println(obj.getStudentName());

	

	}

}
