package com.B_functional_interface;

import java.util.function.Function;

public class SumNnaturalNo {
	public static void main(String[] args) {
		
		Function<Integer,Integer> fun = (num) -> {
			int res = 0;
			for(int i=1;i<=num;i++) {
				res = res + i;
			}
			return res;
		};
			System.out.println(fun.apply(10));
		}

}
