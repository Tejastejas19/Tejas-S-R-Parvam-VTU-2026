package com.A.exception_handling;

public class Exceptionhandling4 {
	public static void main(String[] args) {
		System.out.println("Start of program");
		try {
			System.out.println("res:"+(10/0));
			
		}catch (ArithmeticException e) {
			System.out.println("Cannot divide by zero");
		}
		finally {
			System.out.println("This is finally block");
		}
		System.out.println("End of program");
	}

}
