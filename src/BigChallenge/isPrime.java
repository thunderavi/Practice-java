package BigChallenge;

import java.util.Scanner;

public class isPrime {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Check number is prime or not");
        System.out.print("Enter a number : ");
        int num = read.nextInt();
        boolean isPrime = isPrimeOrnot(num);
        if (isPrime){
            System.out.println("Your number is prime");
        }else {
            System.out.println("your number is notPrime");
        }
    }
    public static boolean isPrimeOrnot(int num){
        int i =2;
        while (i < num){
            if (num % i == 0){
                return false;
            }
            i++;
        }
        return true;
    }
}
