package BigChallenge;

import java.util.Scanner;

public class SumOfALlDigit {
    public static void main(String[] args) {
        System.out.println("Welcome to Sum of all digit number");
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number :");
        int num = read.nextInt();
        int sum = sumOfDigits(num);
        System.out.println("Sum of all Digit is : "+sum);

    }
    public static int sumOfDigits(int num){
        int sum = 0;
        while (num > 0){
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
}
