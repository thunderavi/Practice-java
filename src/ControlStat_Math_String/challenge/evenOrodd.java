package ControlStat_Math_String.challenge;

import java.util.Scanner;

public class evenOrodd {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("FInd even and odd number using ternary");
        System.out.print("Enter first number : ");
        int num = read.nextInt();

        String Result = (num % 2 == 0 ) ? "even" : "odd";
        System.out.println(Result);
    }
}
