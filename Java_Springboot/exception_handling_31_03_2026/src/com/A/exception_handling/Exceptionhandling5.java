package com.A.exception_handling;

import java.io.PrintWriter;

public class Exceptionhandling5 {
	public static void main(String[] args) {
		PrintWriter pw  = null;
		try {
			System.out.println("opening file");
			pw = new PrintWriter("world.txt");
			pw.write("Hello world");
			System.out.println("Completed");
			
		} finally {
			System.out.println("closing file");
			if(pw != null) {
				pw.close();
			}
		}
	}

}
