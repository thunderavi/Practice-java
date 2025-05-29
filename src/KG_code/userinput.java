package KG_code;

import java.util.Scanner;


public class userinput {

    public static int add(int n , int m){

        int result = n + m;
        return result;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please Enter your name:");
        String name = input.nextLine();
        System.out.println("Good Morning " + name.toUpperCase());
        System.out.print(name + ", Also tell me your Age :");
        int age = input.nextInt();
        System.out.println("Your Age is :"+ age);

        System.out.print("Enter the first number: ");
        int n = input.nextInt();
        System.out.print("Enter your second number: ");
        int m =input.nextInt();
        System.out.println("The sum is: "+add(n,m));
    }
}
