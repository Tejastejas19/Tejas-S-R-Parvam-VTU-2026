package com.D_constructorreference_02_04;

import java.util.function.Supplier;

class Person{
	String name;
	
	public Person() {
		super();
	}
	
	public Person(String name) {
		super();
		this.name = name;
	}
}
public class A_constructorReference {
	public static void main(String[] args) {
		//Person = new Person();
	//without
		Supplier<Person> sup = ()->new Person();
		Person person = sup.get();
		person.name = "Tejas";
		System.out.println(person.name);
		//with
		Supplier<Person> sup1 = ()->new Person();
		Person person1 = sup1.get();
		person1.name = "Tejas";
		System.out.println(person1.name);
	}
}
