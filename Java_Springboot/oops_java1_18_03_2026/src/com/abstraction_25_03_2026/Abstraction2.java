package com.abstraction_25_03_2026;

interface Vehicle {
	int max=120;
	public void start();
}

class Car implements Vehicle {

	@Override
	public void start() {
		System.out.println("car is started");
	}
}

public class Abstraction2 {
	public static void main(String[] args) {
		Car c = new Car();
		c.start();
	}

}
