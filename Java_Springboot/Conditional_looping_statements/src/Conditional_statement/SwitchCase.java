package Conditional_statement;

import java.util.Scanner;

public class SwitchCase {
	public static void main(String[] args) {
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter day no:");
		int value = sc.nextInt();
//		switch(value) {
//		case 1:{
//			System.out.println("Mon");
//			break;
//		}
//		case 2:{
//			System.out.println("Tue");
//			break;
//		}
//		default:{
//			System.out.println("Invalid");
//		}
//		}
		String typeofday = switch (value) {
		case 1,2,3,4,5,6 ->"Weeday";
		case 7 -> "Weekend";
		default ->"Invaild day";
		};
		System.out.println("Res:"+typeofday);
		sc.close();
	}
}
