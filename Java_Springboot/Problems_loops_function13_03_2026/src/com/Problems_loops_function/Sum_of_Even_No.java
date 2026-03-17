package com.Problems_loops_function;

import java.util.Scanner;

public class Sum_of_Even_No {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the even number");
		int num = sc.nextInt();
		int i = 1;
		int res = 0;
		while (i <= num) {
			if(i%2==0)//even
				//if(i%2!=0)//odd
				res = res + i;
			i++;
		}
		System.out.println("Result is:" + res);
	}

}
