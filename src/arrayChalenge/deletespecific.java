package arrayChalenge;

import java.util.Scanner;

public class deletespecific {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welocome to Array Deletion\n");
        int[] numArr = ArrayUtility.inputArray();
        System.out.print("Now, enter the number you want to delete :");
        int numtoDelete = read.nextInt();
        int[] newArr = deleteNumber(numArr,numtoDelete);
        System.out.print("Here is your array");
        ArrayUtility.displayArray(newArr);



    }
    public static int[] deleteNumber(int[] numArr , int numtoDelete){
        int occ = ArraySearch.noOccurences(numArr,numtoDelete);
        if (occ == 0){
            return numArr;
        }
        int newSize = numArr.length - occ;
        int[] newArr = new int[newSize];

        int i =0,j=0;
        while (i<numArr.length){
            if (numArr[i] != numtoDelete){
                numArr[j] = numArr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
}
