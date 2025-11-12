package com.business.blc.elc;

public class student {

	String studentName;
	String studentBranch;
	String studentCollege;
	long studentId;
	public String getStudentName() {
		return studentName;
	}
	public String getStudentBranch() {
		return studentBranch;
	}
	public String getStudentCollege() {
		return studentCollege;
	}
	public long getStudentId() {
		return studentId;
	}
	
	public void setStudentName(String name) {
		studentName=name;
	}
	public void setStudentBranch(String branch) {
		studentBranch=branch;
	}
	public void setStudentCollege(String college) {
		studentCollege=college;
	}
	public void setStudentId(long id) {
		studentId=id;
	}
	
	public String displayData() {
		return "Studentname : "+studentName+"\nStudentId : "+ studentId+"\nstudentBranch : "+studentBranch+"\nstrudentCollege : "+studentCollege;
	}
	
	

}
