package ControlStat_Math_String.challenge;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Absolute {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to absolute number");
        System.out.print("Enter the number you want an absolute number: ");

        int n = read.nextInt();

        int drivenresult = (n >0)? n : -n;
        System.out.println("Your absolute number is : "+drivenresult);
    }
}
