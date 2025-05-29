package challenge;

import java.util.Scanner;

public class locicalt4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int year = read.nextInt();
        if (year %4 == 0){
            if (year % 100 ==0){
                if (year %400 == 0){
                    System.out.println("Leap Year");
                }else{
                    System.out.println("Not a Leap year");
                }
            }

        }else{
            System.out.println("Not a Leap year");
        }
    }
}
