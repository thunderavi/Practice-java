package challenge;

import java.util.Scanner;

public class logicalt2 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = read.nextInt();
        if (n%2 ==0){
            System.out.println("Number is even");
        }else {
            System.out.println("Number is Odd");
        }
    }
}
