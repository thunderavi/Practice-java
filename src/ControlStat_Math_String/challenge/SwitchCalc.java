package ControlStat_Math_String.challenge;

import java.util.Scanner;

public class SwitchCalc {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);

        System.out.println("Welcome to Simple Calculator");
        System.out.print("Enter the first number: ");
        double num1 = read.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = read.nextDouble();

        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = read.next().charAt(0);

        double result;

        switch (operator) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> {
                if (num2 == 0) {
                    System.out.println("Cannot divide by zero.");
                    return; // Exit early
                } else {
                    result = num1 / num2;
                }
            }
            default -> {
                System.out.println("Invalid operator.");
                return;
            }
        }

        System.out.println("Your result is: " + result);
    }
}
