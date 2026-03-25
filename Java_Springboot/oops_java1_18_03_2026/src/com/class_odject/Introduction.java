package com.class_odject;


class Car{
	//properties
	String name="Tesla";
	long Price=10000;
	
	//behaviour
	public void CanDrive(){
		System.out.println("Yes");
	}
}
public class Introduction {
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println("Name:"+c.name);
		System.out.println("Price:"+c.Price);
		c.CanDrive();
		
		
	}

}
