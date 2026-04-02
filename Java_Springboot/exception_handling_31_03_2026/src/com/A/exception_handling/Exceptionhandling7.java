package com.A.exception_handling;

public class Exceptionhandling7 {
	public static void main(String[] args) {
		int age = 10;
		try {
			validate(age);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			System.out.println("program completed");
		}
	}

	private static void validate(int age) {
		if(age>=18) {
			System.out.println("Your age is valid");
		}else {
			throw new ArithmeticException("Invalid age number"); 		}
		
	}

}
