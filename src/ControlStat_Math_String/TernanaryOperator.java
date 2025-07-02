package ControlStat_Math_String;

import java.util.Scanner;

public class TernanaryOperator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welocme to number checker");
        System.out.print("Please enter your first number : ");
        int num1 = read.nextInt();
        System.out.print("Please enter your Second number: ");
        int num2 = read.nextInt();

//        int graterInteger;
//        if (num1 > num2){
//           graterInteger = num1;
//        }else {
//            graterInteger = num2;
//        }
//        System.out.println(graterInteger + " is the greter number");

        // Ternanry operator
        int greaterNumber = num1 > num2 ? num1 : num2;
        System.out.println(greaterNumber + " is the grater number");
    }
}
