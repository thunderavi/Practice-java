package ControlStat_Math_String.challenge;

import java.util.Scanner;

public class ScoreCategory {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welocome to Grade Marks");
        System.out.print("Enter the Marks your have obtained :");
        int marks = read.nextInt();

        String result = (marks > 80) ? "High"
                :(marks >= 50) ? "Moderate"
                :"Low";
        System.out.println("The Grade Marks is : "+ result);
    }
}
