package com.C_methodreference_02_04_2026;

import java.util.function.Supplier;

public class B_InstanceMethodReference1 {
	public String getMessage() {
		return "Instance method";
		
	}
	public static void main(String[] args) {
		B_InstanceMethodReference1 obj1 = new B_InstanceMethodReference1();
		//without
		Supplier<String> sup = ()-> obj1.getMessage();
		System.out.println("Res:"+sup.get());
		//with
		Supplier<String> sup2 = obj1::getMessage;
		System.out.println("Res2:"+sup2.get());
	}

}
