package com.B_functional_interface;

import java.util.Random;
import java.util.function.Supplier;

public class SupplierFunctionalInterface {
	public static void main(String[] args) {
		Supplier<Integer> random = ()-> new Random().nextInt(1000);
		System.out.println(random.get());
	}

}
