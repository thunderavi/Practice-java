package arrayChalenge;

import java.util.Scanner;

public class mergetwosorted {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to merge two sorted");
        int[] numArr1 = ArrayUtility.inputArray();
        int[] numArr2 = ArrayUtility.inputArray();
        int[] mergerArr = merger(numArr1,numArr2);
        ArrayUtility.displayArray(mergerArr);

    }
    public static int[] merger(int[] numArr1,int[] numArr2){
        int newSize = numArr1.length + numArr2.length;
        int[] newArr = new int[newSize];
        int i =0, j=0,k=0;
        while (i< numArr1.length || j < numArr2.length){
            if (j == numArr2.length ||
                    ( i < numArr1.length && numArr1[i] < numArr2[j])){
                newArr[k] =numArr1[i];
                i++;
                k++;
            }else{
                newArr[k] = numArr2[j];
                k++;
                j++;
            }
        }
            return newArr;
    }
}
