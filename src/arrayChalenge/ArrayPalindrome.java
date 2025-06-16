package arrayChalenge;

import java.util.Scanner;

public class ArrayPalindrome {
    public static void main(String[] args) {
        System.out.println("Welocmoe to  plaindrome checker");
        Scanner read = new Scanner(System.in);
        int[] newArr = ArrayUtility.inputArray();
        boolean ispalin = isPalindrome(newArr);
        if (ispalin ){
            System.out.println("Your array is palindrome");
        }else {
            System.out.println("Your array is not palindrome");
        }

    }
    public static boolean isPalindrome(int[] newArr){
        int i =0;
        while (i < newArr.length/2){
            if (newArr[i] != newArr[newArr.length-1-1]){
                return false;
            }
            i++;
        }
        return true;

    }
}
