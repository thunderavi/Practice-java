package KG_code;

import java.util.Scanner;

public class arraysearch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        int[] arr = {3,5,7,6,4,8,9,4,1,2};
        System.out.println("Welcome to Array Search \n");
        System.out.print("Enter the number you want to search");
        int num = read.nextInt();
        boolean isFound = isFound(arr,num);
        if (isFound){
            System.out.println("your number is found");
        }else{
            System.out.println("not found");
        }

    }
    public static boolean isFound(int[] arr, int num){
        int index = 0;
        while (index < arr.length){
            if (arr[index] == num){
                return true;
            }
            index++;
        }
        return false;
    }
}
