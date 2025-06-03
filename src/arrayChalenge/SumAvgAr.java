package arrayChalenge;

import java.util.Scanner;

public class SumAvgAr {
    public static void main(String[] args) {
        System.out.println("Welcome to Array sum and Average");
        int[] numArray= ArrayUtility.inputArray();
        long sum = sum(numArray);
        double avg = Average(numArray);
        System.out.println("Sum of the number is : "+ sum);
        System.out.println("Average of the number : "+ avg);
    }
    public static long sum(int[] numArrays){
        long sum = 0;
        int i =0 ;
        while (i < numArrays.length){
            sum +=numArrays[i];
            i++;
        }
        return sum;
    }
    public static double Average(int[] numArrays){
        double sum = sum(numArrays);

        return (sum/numArrays.length);
    }
}
