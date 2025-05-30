package challenge;

import java.util.Scanner;

public class bitwisecoplement2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Showcase LeftShift Operator  operator");
        System.out.print("Enter the number :");
        int num =read.nextInt();


        int result = num << 1;
        System.out.println("THe result is :" +result);

    }
}
