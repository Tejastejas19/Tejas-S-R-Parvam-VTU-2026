package com.B_functional_interface;

@FunctionalInterface
interface AddTwoNumber {
	int add(int a, int b);
}

public class FunctionalInterface2 {
	public static void main(String[] args) {
		AddTwoNumber add_two = (a, b) -> a + b;
		int res = add_two.add(12, 34);
		System.out.println("Result:" + res);
	}

}
