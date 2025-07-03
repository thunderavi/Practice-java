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
        String operator = read.next();

        double result = switch (operator) {
            case "+" -> num1 + num2;
            case "-" -> num1 - num2;
            case "*" -> num1 * num2;
            case "/" -> num1 / num2;
            default -> Double.NaN; // Not a number if operator is invalid
        };

        System.out.println("Your result is: " + result);
    }
}
