package BigChallenge;

import java.util.Scanner;

public class Patternprint {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the Pattern");
        System.out.print("Enter number: ");
        int num = read.nextInt();

        printPattern(num);
        System.out.println(" ");
        secondpattern(num);
    }

    public static void printPattern(int num) {
        int row = 1;
        while (row <= num) {
            int col = 1;
            while (col <= row) {
                System.out.print("* ");
                col++;
            }
            System.out.println();
            row++;
        }
    }
    public static void  secondpattern(int num){
        int i = num;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i--;
        }

    }
}
