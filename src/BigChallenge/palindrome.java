package BigChallenge;

import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome");
        Scanner read = new Scanner(System.in);
        int num = read.nextInt();
        if (ispalindrome(num)){
            System.out.println("It is palindrome");
        }else {
            System.out.println("Not a palindrome");
        }


    }
    public static boolean ispalindrome(int num){
        int original = num;
        int count =0;
        while (num != 0){
            int digit = num % 10;
            count = count*10 + digit;
            num /= 10;
        }
        return original == count;
    }
}
