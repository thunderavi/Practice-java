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
}
