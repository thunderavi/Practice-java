package challenge;

import java.util.Scanner;

public class locicalt5 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Get your Grades");
        System.out.print("Enter the marks :");
        int marks = read.nextInt();
        if (marks < 0 || marks > 100){
            System.out.println("Invalid Marks");
        }
        String grade;
        if (marks >= 90){
            grade = "A";
        } else if (marks >=75) {
            grade="B";
        } else if (marks >=60) {
            grade= "C";
        } else if (marks >= 30) {
            grade = "D";
        }else {
            grade = "E";
        }
        System.out.println("your scored "+ marks + " Grade is "+ grade);
    }
}
