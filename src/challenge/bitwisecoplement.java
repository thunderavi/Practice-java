package challenge;

import java.util.Scanner;

public class bitwisecoplement {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Not/Complimant  operator");
        System.out.print("Enter the number :");
        int num =read.nextInt();


        int result = ~num;
        System.out.println("THe result is :" +result);

    }
}
