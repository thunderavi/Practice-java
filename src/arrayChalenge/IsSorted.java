package arrayChalenge;

import java.util.Scanner;

class IsSorted {
     public static void main(String[] args) {
         Scanner read = new Scanner(System.in);
         int[] Arr = ArrayUtility.inputArray();
         boolean isInc = isDecreasing(Arr);
         boolean isdes= isIncreasing(Arr);
         if (isInc || isdes){
             System.out.println("Your array is sorted");
         }else {
             System.out.println("Your array is not Sorted");
         }


     }
     public  static  boolean isIncreasing(int[] Arr){
         int i =1;
         while (i < Arr.length){
             if (Arr[i] < Arr[i-1]){ //then this is not increasing
                 return false;
             }
             i++;
         }
         return true;
    }
    public  static  boolean isDecreasing(int[] Arr){
        int i =1;
        while (i < Arr.length){
            if (Arr[i] > Arr[i-1]){ //then this is not increasing
                return false;
            }
            i++;
        }
        return true;
    }
}
