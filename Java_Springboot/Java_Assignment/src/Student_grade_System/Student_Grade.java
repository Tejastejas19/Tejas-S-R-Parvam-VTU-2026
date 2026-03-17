package Student_grade_System;

import java.util.Scanner;

public class Student_Grade {
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter marks: ");
        int marks = sc.nextInt();

        char grade;
//        if(marks>100) {
//        	grade ='I';        
//        }
        if (marks >= 90 && marks <= 100) {
            grade = 'A';
        } else if (marks >= 75 && marks <= 89) {
            grade = 'B';
        } else if (marks >= 60 && marks <= 74) {
            grade = 'C';
        } else if (marks >= 50 && marks <= 59) {
            grade = 'D';
        } else {
            grade = 'F';
        }

        System.out.println("Grade: " + grade);

        switch (grade) {
            case 'A':
                System.out.println("Grade Description: Excellent");
                break;
            case 'B':
                System.out.println("Grade Description: Good");
                break;
            case 'C':
                System.out.println("Grade Description: Average");
                break;
            case 'D':
                System.out.println("Grade Description: Pass");
                break;
//            case 'I':{
//            	System.out.println("Invalid");
//            	break;
//            }
            default:
                System.out.println("Grade Description: Fail");
      }
    }
}
