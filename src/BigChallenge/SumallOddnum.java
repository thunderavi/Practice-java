package BigChallenge;

import java.util.Scanner;

public class SumallOddnum {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Odd saum");
        System.out.print("Please Enter the number :");
        int num = read.nextInt();
        int sum = oddSum(num);
        System.out.println("oddSUm" + num + "is: " + sum);
    }

    public static int oddSum(int num){
        int i =1;
        int sum = 0;
        while (i <= num ){
            sum += i;
            i += 2;
        }
        return sum;
    }
}
