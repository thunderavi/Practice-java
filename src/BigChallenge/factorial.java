package BigChallenge;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Fatorial of number");
        System.out.print("Please enter number to find factorial : ");
        int num = read.nextInt();
        int fact = factorial(num);
        System.out.println("THe fatorial of "+ "num is : " + fact);
    }
    public static int factorial(int num){
        int i =1;
        int sum = 1;
        while (i <= num){
            sum = sum * i;
            i++;
        }
            return sum;
    }
}
