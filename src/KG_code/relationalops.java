package KG_code;

import java.util.Scanner;

public class relationalops {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welocme to Driving Licencse");
        System.out.print("Please enter your age:");
        int age = read.nextInt();

        if (age >= 18){
            System.out.println("Your are eligible to drive");
        }else{
            System.out.println("Yor are not eligible");
        }
    }
}
