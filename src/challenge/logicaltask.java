package challenge;

import java.util.Scanner;

public class logicaltask {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int n = read.nextInt();
        if (n > 0) {
            System.out.println("Number is positive");
        } else if (n < 0) {
            System.out.println("Number is negative");
        }else {
            System.out.println("The number is zero");
        }


    }

}
