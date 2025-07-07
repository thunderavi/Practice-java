package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class recursionFibo {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Recursuve function fiboo series");
        System.out.print("Enter the number your want fibonacci :");
        int count = read.nextInt();
        for (int i=1;i<=count;i++){
            System.out.print(fibonaci(i)+" ");
        }

    }
    public static int fibonaci(int position){
        System.out.print(".");
        if (position == 1){
            return 0;
        }
        if (position == 2){
            return 1;
        }

        return fibonaci(position - 1)+
                fibonaci(position-2);
    }
}
