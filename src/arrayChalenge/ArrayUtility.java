package arrayChalenge;

import java.util.Scanner;

public class ArrayUtility {
    public static int[] inputArray(){
        Scanner read = new Scanner(System.in);

        System.out.println("Please enter the number of elements ");
        int size = read.nextInt();
        int[] num = new int[size];
        int i = 0;
        while (i < size){
            System.out.println("please enter element number"+(i+1) + ": ");
            num[i] = read.nextInt();
            i++;
        }
        return num;
    }
    public static void displayArray(int[] numArray){
        int i = 0;
        while (i < numArray.length){
            System.out.print(numArray[i] + " ");
            i++;
        }
        System.out.println();
    }
    public static int[][] input2DArray(){
        Scanner read = new Scanner(System.in);

        System.out.print("Please enter the number of rows : ");
        int rows = read.nextInt();
        System.out.print("Please enter the number of column: ");
        int columns = read.nextInt();


        int[][] numArray = new int[rows][columns];

        int i = 0;
        while (i < rows){
            int j =0;
            while (j < columns){
                System.out.println("please enter element at row: " + (i+1) + ", column: " + (j+1) + " :");

                numArray[i][j] = read.nextInt();
            j++;
            }
            i++;
        }

        return numArray;
}
}
