package arrayChalenge;

import java.util.Scanner;

public class searcharray2d {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to 2D Search");
        int[][] numArr = ArrayUtility.input2DArray();
        System.out.println("Enter the number you want to search");
        int num = read.nextInt();
        boolean isFound = search(numArr,num);
        if (isFound){
            System.out.println("YOur number is found");
        }else{
            System.out.println("Number not found");
        }
    }
    public static  boolean search(int[][] numArr ,int num ){
        int i=0;
        while (i < numArr.length){
            int j=0;
            while (j< numArr[i].length){
                if (numArr[i][j] == num){
                    return true;
                }
                j++;
            }
            i++;
        }
        return false;
    }
}
