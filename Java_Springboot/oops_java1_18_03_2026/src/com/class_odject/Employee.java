package com.class_odject;

public class Employee {
	String emp_name;
	int emp_id;
	String emp_email;
	
	public String isWorking() {
		return "Yes he is working";
	}
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		emp.emp_name="Mohan";
		emp.emp_id=121;
		emp.emp_email="mohan@gmail.com";
		String res = emp .isWorking();
		System.out.println("emp_name:"+emp.emp_name);
		System.out.println("emp_id:"+emp.emp_id);
		System.out.println("emp_email:"+emp.emp_email);
		System.out.println(res);
		
		Employee emp1 = new Employee();
		emp1.emp_name="Mohan";
		emp1.emp_id=121;
		emp1.emp_email="mohan@gmail.com";
		String res1 = emp .isWorking();
		System.out.println("emp_name:"+emp1.emp_name);
		System.out.println("emp_id:"+emp1.emp_id);
		System.out.println("emp_email:"+emp1.emp_email);
		System.out.println(res1);
	}

}
