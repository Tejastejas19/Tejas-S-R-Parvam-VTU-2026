package ass_01_04_2026;

import java.util.Scanner;

@FunctionalInterface
interface EvenOrOdd {
	boolean even_odd(int a);
}

public class Even_or_Odd {
	public static void main(String[] args) {

		EvenOrOdd E_O = a -> a % 2 == 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number:");

		int num = sc.nextInt();
		
		if (E_O.even_odd(num)) {
			System.out.println(num + " is Even");
		} else {
			System.out.println(num + " is Odd");
		}
		sc.close();
	}

}
