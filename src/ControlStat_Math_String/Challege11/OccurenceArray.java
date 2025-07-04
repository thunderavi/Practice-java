package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class OccurenceArray {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to find occurence in array ");
        System.out.print("Enter the number of array : ");
        int size = read.nextInt();
        int[] arr = new int[size];
        for (int i =0;i<size;i++){
            System.out.print("Enter the array:");
            arr[i] = read.nextInt();
        }

        System.out.println("Enter the your find most occurence number:");
        int target = read.nextInt();
        System.out.print("your array is :");
        for (int num: arr){
            System.out.print(num+" ");
        }

        int result = Occurence(arr,target);
        System.out.println("\nOccurence of number :"+result);

    }
    public static int Occurence(int[] arr,int target){
        int count = 0;
        for (int num : arr){
            if (num == target){
                count += 1;
            }

        }
        return count;
    }
}
