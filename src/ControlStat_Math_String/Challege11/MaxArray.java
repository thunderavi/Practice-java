package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class MaxArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to find the maximum value is array");
        System.out.print("Enter the number of array : ");
        int size = read.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
        System.out.print("Enter the array:");
        arr[i] = read.nextInt();
        }
        System.out.print("your array is :");
        for (int num: arr){
            System.out.print(num+" ");
        }
        System.out.println();
        int result = MaxArray(arr);
        System.out.println("The Max element in array is : "+result);

    }
    public static int MaxArray(int[] arr){
       int max = arr[0];
       for (int num : arr){
           System.out.println(num);
           if (num > max){
               max = num;
               System.out.println(".....");
               System.out.println(max);
           }
       }

    return max;
    }
}
