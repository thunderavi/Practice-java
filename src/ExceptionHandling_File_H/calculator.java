package ExceptionHandling_File_H;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to division calculator");
        System.out.print("Please enter your first number : ");

        int first = read.nextInt();
        System.out.print("Please enter your Second number : ");

        int second = read.nextInt();

        try {
            int[] a = new int[5];
//            System.out.printf("Result is %d", a[6]);
            a[6] = first / second;
            int result = first / second;
//            System.out.printf("Result is %d", a[6]);
            System.out.printf("Result is %d", result);
        }catch (ArithmeticException exception){
            System.out.printf("%s , enter valid values",
                    exception.getMessage());
//        }catch (ArrayIndexOutOfBoundsException exc){
//            System.out.println("Array is out of Bound");
        }catch (Throwable th){  // more general and parent
            System.out.println("General Exception");
        }
    }
}
