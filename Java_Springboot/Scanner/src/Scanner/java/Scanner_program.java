package Scanner.java;

import java.util.Scanner;

public class Scanner_program {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a name:");
		String name =sc.nextLine();
		System.out.println("your name is:"+name);
		System.out.println("hello"+name);
		
	}
}
