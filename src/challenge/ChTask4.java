package challenge;

import java.util.Scanner;

public class ChTask4 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Number :");
        int num = read.nextInt();
        if ((num & 1) == 1){
            System.out.println("Your number is Odd");
        }else{
            System.out.println("Your number is Even");
        }
    }
}
