package ControlStat_Math_String.challenge;

import java.util.Scanner;

public class Min2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Find minimum Two number : ");
        System.out.print("Enter first number: ");
        int num1 = read.nextInt();
        System.out.print("Enter second number");
        int num2 = read.nextInt();

        int minTwo = num1 > num2 ? num2 : num1;
        System.out.println(minTwo+ " is the min number.");
    }
}
