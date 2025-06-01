package BigChallenge;

import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Welcome Armstrong number");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num =read.nextInt();
        boolean isArmstrong = isArmstrong(num);
        if (isArmstrong){
            System.out.println("Your number is armstrong");
        }else {
            System.out.println("Not Armstrong");
        }
    }
    public static boolean isArmstrong(int num){
        int nodigits = numberofDigits(num);
        int numcopy = num;
        int finalNumber = 0;
        while (num > 0){
            int lastdigit = num % 10;
            num /= 10;
            finalNumber += power(lastdigit,nodigits);

        }
        return finalNumber == numcopy;
    }
    public static int power(int num1, int num2){
        int result = num1;
        int i = 1;
        while (i < num2){
            result *= num1;
            i++;
        }

        return result;

    }
    public static int numberofDigits(int num){
        int digits = 0;
        while (num > 0){
            digits++;
            num /= 10;
        }
        return digits;
    }
}
