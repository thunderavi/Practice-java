package ControlStat_Math_String;

import java.util.Scanner;

public class DoWhile {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
//        System.out.println("Please enter your age");
//        int age = read.nextInt();
//        while (age < 0 || age >100){
//            System.out.println("Please enter your age");
//            age = read.nextInt();
//        }
        int age ;
        do{
            System.out.println("Please enter your age");
            age = read.nextInt();
        }while (age <0 || age >100);
            System.out.println("Your age is :"+age);


    }
}
