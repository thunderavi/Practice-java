package ControlStat_Math_String;

import java.util.Scanner;

public class RecursionselfCall {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Recursion");
        System.out.print("Please enter your number : ");
        int num = read.nextInt();
        long fact = factorial(num);
        System.out.println("Fatorial of your number is : "+fact);
        long fact2 = factorialIterative(num);
        System.out.println("Fatorial2 of your number is : "+fact2);
    }

    public static long factorial(int num){
        System.out.println("Function called for :"+num );
        if (num == 1){
            return 1;
        }
        return num * factorial(num-1);
    }

    //.......................................................
    public static long factorialIterative(int num){
        long result = 1;
        for (int i=1;i<=num;i++){
            result *= i;
        }
        return result;
    }
}
