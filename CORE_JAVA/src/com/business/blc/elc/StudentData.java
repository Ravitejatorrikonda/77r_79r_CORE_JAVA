package com.business.blc.elc;

public class StudentData {

	public static void main(String[] args) {
		student st=new student();
		st.setStudentName("Sampu");
		st.setStudentBranch("ECE");
		st.setStudentCollege("mallareddy");
		st.setStudentId(43);
		System.out.println(st.displayData());
		
	}

}
