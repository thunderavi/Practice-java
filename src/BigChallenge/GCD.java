package BigChallenge;

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the Least common Multiple (LCM)");
        System.out.print("Enter First number :");
        int first = read.nextInt();
        System.out.print("Enter Second number :");
        int Second = read.nextInt();
        int total= GDC(first,Second);
        System.out.println("GCD result is "+total);
    }
    public static int GDC(int first, int Second){
        while (Second!=0){
            int temp =Second;
            Second = first % Second;
            System.out.println("Before"+Second);
            first = temp;
            System.out.println("After"+first);
        }
        return first;
    }
}
