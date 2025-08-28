package com.student;

public class Student {
		String name;
		String dept;
		float age;
		int rollno;
		static String collegename="KIET";
		public Student(String name,String dept,int rollno,float age) {
			this.name=name;
			this.dept=dept;
			this.rollno=rollno;
	    	this.age=age;
		}
		public Student() {
			this.name="";
			this.dept="";
			this.rollno=0;
			this.age=0;
		}
		public void studying(int no_of_hours) {
			System.out.println("the Student"+name+"is studing for"+no_of_hours);
		}
		
		public void readandwrite() {
			System.out.println("the student can read and write");
		}
		public void displayinfo() {
			System.out.println("Student name is "+name+", and age is "+age+", roll no "+rollno+", and department is "+dept);
		}
		public void payFee() {
			System.out.println("Student pay fee");
		}
		public void search(int rollno){
			System.out.println("searching by roll no "+rollno);
		}
		public void search(String name,String dept){
			System.out.println("searching by name and department "+name+dept);
		}
		public void search(String name,int rollno){
			System.out.println("searching by name and roll no "+name+35);
		}
		public static void main(String arg[]) {
		    Student student1=new Student();
			Student student2=new Student("rohan","ai",23,32);
			student1.search(23);
			student1.search("rahul",34);
			student1.search("Aman","CSEAI");
			student2.search(23);
			student2.search("ram",23);
 			student1.displayinfo();
			student2.displayinfo();
		}

	}