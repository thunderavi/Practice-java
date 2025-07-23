package ExceptionHandling_File_H;

import java.util.Scanner;

public class ArException {
    public static void main(String[] args) {
    Scanner read = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int first = read.nextInt();
        System.out.print("Enter second number: ");
        int second = read.nextInt();
    try {
        int result = first / second;
        System.out.println("Your result is :"+result);
    }catch (ArithmeticException exception){
        if (exception.getMessage().equals("/ by zero")){
            System.out.println("Divide by zero occur");
        }else {
            throw exception;
        }
    }

    }

}
