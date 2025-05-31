package BigChallenge;

import java.util.Scanner;

public class table_multi {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Multiplication Table");
        System.out.println("Plase Enter your number : ");
        int num = read.nextInt();
        printmultiplication(num);

    }
    public static void printmultiplication(int num){
        int i =1;
        while (i <= 10){
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
