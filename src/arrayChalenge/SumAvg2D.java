package arrayChalenge;

import java.util.Scanner;

public class SumAvg2D {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to sum and Avg of 2D Array");
        int[][] numArray = ArrayUtility.input2DArray();
        long sum = sum(numArray);
        double avg = Avg(numArray);
        System.out.println("Your sum of Array is : "+sum);
        System.out.println("YOur Average of Array is :"+avg);



    }
    public static double Avg(int[][] numArray){
        if (numArray.length == 0){
            return 0;
        }
        int rows = numArray.length;
        int cols = numArray[0].length;
        double size = rows * cols;
        return sum(numArray)/size;
    }

    public static long sum(int[][] numArray){
        long sum =0;
        int i = 0;
        while (i < numArray.length){
            int j=0;
            while (j< numArray[i].length){
                sum += numArray[i][j];
                j++;
            }
            i++;
        }
        return sum;
    }
}
