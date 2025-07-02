package ControlStat_Math_String.challenge;

import java.util.Scanner;

public class MonthOftheYear {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Know the month of the year  ");
        System.out.println("Enter the number you want to search month : ");
        int month = read.nextInt();

        String monthstr = switch (month){
            case 1 -> "January";
            case 2 -> "Feburary";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11-> "November";
            case 12-> "December";
            default -> "Invalid";

        };
        System.out.println("Your month name is "+ monthstr);
    }
}
