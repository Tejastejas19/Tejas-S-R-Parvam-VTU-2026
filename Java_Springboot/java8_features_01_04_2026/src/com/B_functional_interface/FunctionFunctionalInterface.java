package com.B_functional_interface;

import java.util.function.Function;

public class FunctionFunctionalInterface {
	public static void main(String[] args) {
		Function<String, Integer> fun = s->s.length();
		int res = fun.apply("hello world");
		System.out.println("Res:"+res);
	}
}
