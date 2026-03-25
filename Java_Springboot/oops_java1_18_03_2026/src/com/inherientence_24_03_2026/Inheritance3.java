package com.inherientence_24_03_2026;

class Vechicle{
	public String brand;
	public String model;
	public Vechicle(String brand, String model) {
		super();
		this.brand = brand;
		this.model = model;
	}
	
}

class Car extends Vechicle{
	public int nowheels;

	public Car(String brand, String model, int nowheels) {
		super(brand, model);
		this.nowheels = nowheels;
	}

	@Override
	public String toString() {
		return "Car [nowheels=" + nowheels + ", brand=" + brand + ", model=" + model + "]";
	}
		
}
public class Inheritance3 {
	public static void main(String[] args) {
		Car c = new Car("Tesla","Modelx",4);
		System.out.println(c);
		
	}

}
