//Print Number from N to 1
package practice_program;

import java.util.Scanner;

public class program2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int n = sc.nextInt();
		
		for(int i=n;i>=1;i--){
			System.out.println(i);
			
		}
	}

}
