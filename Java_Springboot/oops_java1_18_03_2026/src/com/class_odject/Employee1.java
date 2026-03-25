package com.class_odject;

import java.util.Scanner;

public class Employee1 {
	String emp_name;
	int emp_id;
	String emp_email;

	public String isWorking() {
		return "Yes he is working";
	}

	public static void main(String[] args) {

		Employee1 emp = new Employee1();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the employee details:");

		System.out.println("Enter emp_name:");
		emp.emp_name = sc.nextLine();
		System.out.println("Enter emp_id:");
		emp.emp_id = sc.nextInt();
		sc.nextLine();
		System.out.println("enter emp_email:");
		emp.emp_email = sc.nextLine();
		String res = emp.isWorking();

		System.out.println("Enter res:");
		System.out.println("emp_name:" + emp.emp_name);
		System.out.println("emp_id:" + emp.emp_id);
		System.out.println("emp_email:" + emp.emp_email);
		System.out.println(res);
	}
}
