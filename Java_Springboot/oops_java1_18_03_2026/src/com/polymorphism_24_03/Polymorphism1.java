package com.polymorphism_24_03;

class Addition{
	public void add(int a, int b) {
		System.out.println("Result:"+(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Result:"+(a+b+c));
	}
	public void add(float a, int b, int c) {
		System.out.println("Result:"+(a+b+c));
	}

}
public class Polymorphism1 {
	public static void main(String[] args) {
		Addition add1 = new Addition();
		add1.add(20, 20);
		add1.add(20, 30, 50);
		add1.add(30f,30,70);
	}

}
