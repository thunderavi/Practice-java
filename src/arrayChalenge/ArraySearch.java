package arrayChalenge;

import java.util.Scanner;

class ArraySearch {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to Occurences Array ");
        int[] numArr= ArrayUtility.inputArray();
        System.out.print("Now enter the number you want to find :");
        int num = read.nextInt();
        int noOcuurence= noOccurences(numArr,num);
        System.out.println("Your element was found "+ noOcuurence);
    }

    public static int noOccurences(int[] numArr,int num){
        int occ = 0;
        int i = 0;
        while (i < numArr.length){
            if (numArr[i] == num){
                occ++;
            }
            i++;
        }
        return occ;
    }
}
