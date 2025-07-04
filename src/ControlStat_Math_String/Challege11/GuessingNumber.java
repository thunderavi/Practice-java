package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class GuessingNumber {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to guessing number !!");
        int number;
        int guessNumber = (int)(Math.random()*10);
        System.out.println(guessNumber);

        do {
            System.out.print("Enter Your number : ");
            number = read.nextInt();
        }while (number != guessNumber);
        System.out.println("  matched !! ");

    }
}
