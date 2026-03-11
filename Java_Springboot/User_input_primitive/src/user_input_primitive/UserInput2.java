package user_input_primitive;

import java.lang.reflect.Array;
import java.util.Scanner;

public class UserInput2 {
	public static void main(String[] args) {
		//array
		//scanner
		Scanner sc = new Scanner(System.in);
		int marks[]=new int[3];
		System.out.println("Enter value:");
		marks[0]=sc.nextInt();
		marks[1]=sc.nextInt();
		marks[2]=sc.nextInt();
		System.out.println("Array "+Array.toString(arr));
	}

}
