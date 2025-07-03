package ControlStat_Math_String;

import java.util.Scanner;

public class ForLoop {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int i =0;
        while (i <=100){
            System.out.print(i+" ");
            i++;
        }
        System.out.println();
        //print odd number using for loop
        for (int j =1;j<=100;j+=2){
            System.out.print(j+" ");
        }
    }
}
