package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class PaasswordChecker {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to password Checker !!");
        String password;

        do {
            System.out.print("Enter Your password : ");
            password = read.nextLine();
        }while (password.length() <8);
            System.out.println("Password Accepted");


    }
}
