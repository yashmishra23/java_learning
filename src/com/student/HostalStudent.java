package com.student;

public class HostalStudent extends RegularStudent{
	
	String hostel_name;
	int room_no;
	
	public HostalStudent (String Name, String Department, int RollNo, int Age, int attendance_per, String class_room, String hostel_name, int room_no){
		super(Name,Department,RollNo,Age, attendance_per,class_room);
		this.hostel_name=hostel_name;
		this.room_no=room_no;
	}
	public void payFee() {
		System.out.println("the student"+Name+"paid the tution fee + Library fee + Lab fee + hotal fee");
	}
	
	

}