package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number ypu want to get the Multipliaction Table : ");
        int num = read.nextInt();

        for (int i=1;i<=10;i++){
            System.out.println(num + "X" + i + "="+ num*i);
        }
    }
}
