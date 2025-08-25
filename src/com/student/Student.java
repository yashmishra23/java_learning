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
		
		public void studying(int no_of_hours) {
			System.out.println("the Student"+name+"is studing for"+no_of_hours);
		}
		
		public void readandwrite() {
			System.out.println("the student can read and write");
		}
		public void displayinfo() {
			System.out.println("Student name is "+name+", and age is "+age+", roll no "+rollno+", and department is "+dept);
		}
		public static void main(String arg[]) {
//			Student student1=new Student();
			Student student2=new Student("rohan","ai",23,32);
//			student1.name="yash";
//			student1.dept="CSEAI";
//			student1.age=20;
//			student1.rollno=285;
//			
//			student2.name="yogesh";
//			student2.dept="CSEAI";
//			student2.age=19;
//			student2.rollno=288;
//			System.out.println("college name "+student1.collegename);
//			Student.collegename="IIT Ghaziabad";
//			student1.collegename="AKG";
//			System.out.println("college name "+student2.collegename);
//			student1.displayinfo();
			student2.displayinfo();
		}

	}