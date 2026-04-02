package com.A.exception_handling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Exceptionhandling2 {
	public static void main(String[] args) throws FileNotFoundException{
		// 1st way
		try {
			PrintWriter pw = new PrintWriter("hello.txt");
			pw.write("Hello world");
			System.out.println("Completed");
			pw.close();
		}catch (FileNotFoundException e) {
			//3 way
			e.printStackTrace();
			System.out.println(e.getMessage());
			System.out.println(e);
		}
		// 2nd way
		PrintWriter pw = new PrintWriter("hello.txt");
		pw.write("Hello world");
		System.out.println("Completed");
		pw.close();
	}
}
