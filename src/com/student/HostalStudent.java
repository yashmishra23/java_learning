package com.student;

public class HostalStudent extends RegularStudent {
	String hostel_name;
	int room_no;
	public HostalStudent(String name,String dept,int rollno,int age,int attendence_per,String class_name,String hostel_name,int room_no) {
		super(name,dept,rollno,age,attendence_per,class_name);
		this.hostel_name=hostel_name;
		this.room_no=room_no;
	}
}