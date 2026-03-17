package looping_statement;

import java.util.Scanner;

public class whileLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int count = sc.nextInt();
		int i = 1;
		while (i <= count) {
			System.out.println("value:" + i);
			i++;
		}
	}
}
