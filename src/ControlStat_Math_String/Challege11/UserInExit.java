package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class UserInExit {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to userInput Exit");
        while (true){
            System.out.print("Enter your command : ");
            String command = read.next();
            if (command.equalsIgnoreCase("exit")){
                break;
            }
        }
        System.out.println("You have sucessfully exit");
    }
}
