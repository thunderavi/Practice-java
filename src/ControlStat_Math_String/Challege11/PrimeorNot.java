package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class PrimeorNot {
    public static void main(String[] args) {
        Scanner read= new Scanner(System.in);
        System.out.println("Welcome to the Prime or Not number !!");
        System.out.print("Enter the number to get prime number : ");
        int num = read.nextInt();
        boolean result = isPrime(num);
        System.out.println("Result :"+ result);

    }

    public static boolean isPrime(int num) {
        if (num <=1){
            return false;
        }
        for (int i =2;i<num;i++){
            if (num%i ==0){
                return false;
            }
        }
        return true;
    }
}
