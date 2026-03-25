package com.class_odject;

public class Student {
	
	String Student_Name;
	int Student_RollNo;
	String Student_Email;
	long Student_PhoneNumber; 
	String Student_Address;
	
	public void Attending_class() {
		System.out.println("Yes");
	}
	
	public static void main(String[] args) {
		
		Student student = new Student();
		student.Student_Name="tejas S R";
		student.Student_RollNo=53;
		student.Student_Email="tejas@gmail.com";
		student.Student_PhoneNumber=7736636370l;
		student.Student_Address="Mandya";
		System.out.println("Student_Name:"+student.Student_Name);
		System.out.println("Student_RollNo:"+student.Student_RollNo);
		System.out.println("Student_Email:"+student.Student_Email);
		System.out.println("Student_PhoneNumber:"+student.Student_PhoneNumber);
		System.out.println("Student_Address:"+student.Student_Address);
		
		student.Attending_class();
		
	}
}
