package com.A_intro_collection_framework;

import java.util.ArrayList;
import java.util.Collection;

public class Collection2 {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		c1.add("tejas");
		c1.add(12);
		c1.add(true);
		System.out.println(c1);
		
		Collection c2 = new ArrayList();
		c2.add("Hello");
		
		c1.addAll(c2);
		
		System.out.println(c1);
	}
}
