package BigChallenge;

import java.util.Scanner;

public class SumofInteger {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Sum of All integer");
        System.out.print("Enter the number : ");
        int num = read.nextInt();
        int total = addall(num);
        System.out.println("Sum all the integer "+ total);

    }
    public static int addall(int num){
        int i =1;
        int sum = 0;
        while (i <= num){
            sum += i;
            i++;
        }
        return sum;
    }
}
