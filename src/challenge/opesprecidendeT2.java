package challenge;

import java.util.Scanner;

public class opesprecidendeT2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Showcasing Bitwise OR operator\n");
        System.out.print("Enter first number : ");
        int first = read.nextInt();
        System.out.print("Enter second number : ");
        int second = read.nextInt();

        int result =first | second;
        System.out.println("The OR operator Result : "+result);
    }
}
