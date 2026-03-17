package TypeCasting;

import java.util.Scanner;

public class TypeCasting {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter integer number: ");
        int number = sc.nextInt();

        // Implicit casting
        double d = number;

        // Explicit casting
        int n = (int) d;

        System.out.println("Original Integer Value: " + number);
        System.out.println("After Implicit Casting (int to double): " + d);
        System.out.println("After Explicit Casting (double to int): " + n);
        sc.close();
    }
}

