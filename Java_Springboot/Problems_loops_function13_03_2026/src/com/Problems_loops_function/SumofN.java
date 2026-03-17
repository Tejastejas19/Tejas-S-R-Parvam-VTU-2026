package com.Problems_loops_function;

import java.util.Scanner;

public class SumofN {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();//3
		int i = 1;//4
		int res = 0;//6
		while (i <= num) {//4<=3
			res = res + i;//6
			i++;
		}
		System.out.println("Result is:" + res);
	}

}
