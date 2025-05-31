package KG_code;

import java.util.Scanner;

public class returnstatement {
    public static void main(String[] args) {
        greet();
        int first = readnumber();
        int second = readnumber();
        int sum = first + second;
        System.out.println("The Result is : "+sum);
    }
    public static int readnumber(){
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the  number:");
        int number = read.nextInt();
        return number;
    }
    public static void greet(){
        System.out.println("Welocme to Calculator\n");
    }
}
