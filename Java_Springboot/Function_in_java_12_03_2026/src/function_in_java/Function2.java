package function_in_java;

import java.util.Scanner;

public class Function2 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two number:");
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int res = mul(num1, num2);
		System.out.println("mul:" + res);
		int res1 = NewClass.div(num1, num2);
		System.out.println("div:" + res1);
		
		sc.close();
	}

	public static int mul(int a, int b) {
		return a * b;
	}
}
	class NewClass {
		public static int div(int a, int b) {
			return a / b;
		}
	}


