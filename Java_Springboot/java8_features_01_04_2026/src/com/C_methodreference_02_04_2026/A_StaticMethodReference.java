package com.C_methodreference_02_04_2026;

import java.util.function.Consumer;

public class A_StaticMethodReference {
	
	public static void printMessage(String message) {
		System.out.println("Your Message is:"+message);
	}
	public static void main(String[] args) {
		//without Static method 
		Consumer<String> cons1 = s-> A_StaticMethodReference.printMessage(s);
		cons1.accept("Hello world");
		//with static method
		Consumer<String> cons2 = A_StaticMethodReference::printMessage;
		cons2.accept("Hello world");
	}

}
