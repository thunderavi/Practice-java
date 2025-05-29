package challenge;

import java.util.Scanner;

public class swap {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Swapper \n\n");
        System.out.print("Enter first number : ");
        int a = read.nextInt();
        System.out.print("Enter Second number:");
        int b =read.nextInt();

        int temp =a ;
        a=b;
        b=temp;

        System.out.println("Swappimng done...");
        System.out.println("Value of a is now :"+a);
        System.out.println("value of b is now :"+b);
    }
}
