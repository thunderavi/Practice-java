package challenge;

import java.util.Scanner;

public class logicalT3 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter your number n :");
        int n =read.nextInt();
        System.out.print("Enter your number m :");
        int m= read.nextInt();
        System.out.print("Enter your number o :");
        int o = read.nextInt();

        if (n >= m && n>=o){
            System.out.println("Largest number : "+n);
        } else if (o >= n && o>= m) {
            System.out.println("Largest number :"+o);
        }else {
            System.out.println("Largest number :"+m);
        }
    }
}
