package KG_code;

import java.sql.SQLOutput;
import java.util.Scanner;

public class logicalops {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.println("Enter your Age: ");
        int age = read.nextInt();
        System.out.println("Are you a female? (true/false)");
        boolean isFemale = read.nextBoolean();

        if (age < 5){
            System.out.println("You got 75% dicount");
        } else if (isFemale ) {
            System.out.println("You got 50% dicount");
        } else if (age > 60 && isFemale) {
            System.out.println("your got 25% dicount");
        }else {
            System.out.println("you got no dicount");
        }
    }
}
