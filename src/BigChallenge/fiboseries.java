package BigChallenge;

import java.util.Scanner;

public class fiboseries {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to fibonacci series");
        System.out.print("Enter the first number : ");
        int num = read.nextInt();
        System.out.print("Here is the Fibonacci Series ");
        printFibonacci(num);

    }
    public static void printFibonacci(int num){
        if (num < 0) return;
        System.out.print("0 ");
        if (num == 0) return;
        System.out.print("1 ");

        int first = 0 , second =1;
        while (first + second <= num){
            int third = first + second;
            System.out.print(third+" ");
            first = second;
            second = third;
        }

    }
}
