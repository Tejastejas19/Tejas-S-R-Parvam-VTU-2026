package looping_statement;

import java.util.Scanner;

public class DowhileLoop {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");
		int count = sc.nextInt();
		int i = 1;
		do {
			System.out.println("value:" + i);
			i++;
		} while (i <= count);
	}

}
