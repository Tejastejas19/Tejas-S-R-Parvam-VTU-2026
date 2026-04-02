package com.super_final_26_03_2026;

class Person{
	public void display() {
		
		System.out.println("Parent class display");
	}
}

class Student extends Person{

	@Override
	public void display() {
		System.out.println("Child class display");
	}
}
public class Finalkeyword {
	public static void main(String[] args) {
		
		final int age;
		age=30;
		System.out.println("Age:"+age);
//		age=40;
//		System.out.println("Age:"+age);
		
		Student s1 = new Student();
		s1.display();
		
	}

}
