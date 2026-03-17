package Strings_java;

public class String2 {
	public static void main(String[] args) {
		
		String str1="Hello";//scp
		String str2=new String("Hello");//heap
		String str3="Hello";
		String str4=new String("Hello");
		
		System.out.println("str1 . str2 :"+str1.equals(str2));
		System.out.println("str1 == str2 :"+(str1==str2));
		System.out.println("str1 == str3 :"+(str1==str3));
		System.out.println("str2 == str4 :"+(str2==str4));
		
		System.out.println("str1 com str2 :"+str1.compareTo(str3));
		
	}

}
