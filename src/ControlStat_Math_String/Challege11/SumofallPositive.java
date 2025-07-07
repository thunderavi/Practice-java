package ControlStat_Math_String.Challege11;

import arrayChalenge.ArrayUtility;

import java.util.Scanner;

public class SumofallPositive {
    public static void main(String[] args) {
        System.out.println("Welcome to sum of all positive number");
        Scanner read = new Scanner(System.in);
        int[] arr = ArrayUtility.inputArray();

        int sum = 0;
        for (int num :arr){
            if (num <0){
                continue;
            }
            sum +=num;
        }
        System.out.println("The sum of positive number is :"+sum);
    }
}
