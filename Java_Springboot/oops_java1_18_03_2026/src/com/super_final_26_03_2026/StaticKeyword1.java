package com.super_final_26_03_2026;

class Car{
	String name;
	static int noWheels=4;
	
	public static void display() {
//		System.out.println("Name:"+this.name);
		System.out.println("No Whells:"+Car.noWheels);
	}
}
public class StaticKeyword1 {
	public static void main(String[] args) {
		Car c = new Car();
		c.name="Tesla";
//		c.display();
		Car.display();
		
		Car c1 = new Car();
		c1.name="XYZ";
//		c1.display();
		Car.display();
	}
}
