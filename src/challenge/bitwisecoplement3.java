package challenge;

import java.util.Scanner;

public class bitwisecoplement3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to showcase Right shift  operator");
        System.out.print("Enter the number :");
        int num =read.nextInt();


        int result = num >> 1;
        System.out.println("THe result is :" +result);

    }
}
