package Student_detail;

import java.util.Scanner;

public class Student_detail {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter USN: ");
        String usn = sc.nextLine();

        System.out.print("Enter Branch: ");
        String branch = sc.nextLine();

        System.out.print("Enter Percentage: ");
        double percentage = sc.nextDouble();
        
        sc.close();
        
        System.out.println("----- Student Details -----");
        System.out.println("Name: " + name);
        System.out.println("USN: " + usn);
        System.out.println("Branch: " + branch);
        System.out.println("Percentage: " + percentage);
	}
}
