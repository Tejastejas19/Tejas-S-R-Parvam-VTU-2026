package com.this_super_25_03;

class Student{
	String name;
	int roll;
	static String college="CBIT";
		
	public Student() {
		this("Tejas",53);
	}

	public Student(String name, int roll) {
		super();
		this.name = name;
		this.roll = roll;
		System.out.println("value from constructor:"+this.name+" "+this.roll+" "+this.college);
	}
	
}
public class ThisKeyword {
	 
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println("Name:"+s1.name);
		System.out.println("roll:"+s1.roll);
	}

}
