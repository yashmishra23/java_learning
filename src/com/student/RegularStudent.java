package com.student;

public class RegularStudent extends Student {

	int attendence_per;
	String class_name;
	
	public RegularStudent(String name,String dept,int rollno,float age,int attendence_per,String class_name) {
		super(name,dept,rollno,age);
		this.attendence_per=attendence_per;
		this.class_name=class_name;
	}
	public RegularStudent() {
	
		System.out.println("Student is regular");
}
	public void payFee() { 
		System.out.println("The student"+name+"paid tne tution fee");
	}
}