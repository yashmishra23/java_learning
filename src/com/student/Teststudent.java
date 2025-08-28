package com.student;

public class Teststudent {
	public static void main(String[] args) {
		Student s1 = new Student("Rohan","AIML",67,20);
		System.out.println("The name of the student is "+s1.name);
		RegularStudent rs = new RegularStudent("riya ","AI",90,19,90,"H703");
		HostalStudent hs = new HostalStudent("riya ","AI",90,19,90,"H703","arya",309);
		//parent class function
//		rs.displayinfo();
//		rs.payFee();
		hs.displayinfo();
		hs.payFee();
		s1.payFee();
	}
}