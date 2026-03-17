package Conditional_statement;

import java.util.Scanner;

public class Condition1 {
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age:");
		
		int age =sc.nextInt();
		if(age>20) {
			System.out.println("Valid");
		}else {
			System.out.println("Invalid");
		}
		sc.close();
	}

}
