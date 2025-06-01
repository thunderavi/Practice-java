package BigChallenge;

import java.util.Scanner;

public class Reversedigit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to reverse the number");
        System.out.print("Enter the Number : ");
        int num = read.nextInt();
        int total = reverse(num);
        System.out.println("The Reverse is : "+total);


    }
    public static int reverse(int num){
        int count = 0;
        while (num != 0){
            int t = num % 10;
            count = count*10 + t ;
            num = num/10;

        }
        return count;
    }
}
