package com.C_methodreference_02_04_2026;
import java.util.Arrays;

public class C_InstanceMethodReference2 {
	public static void main(String[] args) {
		String[] names = {"mohan", "Mohan", "murali", "Murali" , "tejas"};
		//without
		Arrays.sort(names, (s1, s2) -> s1.compareToIgnoreCase(s2));
		System.out.println(Arrays.toString(names));
		//with
		Arrays.sort(names, String::compareToIgnoreCase);
		System.out.println(Arrays.toString(names));
	}

}
