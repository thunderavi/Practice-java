package ControlStat_Math_String.Challege11;

import java.util.Scanner;

public class Recusivepalindrome {
    public static void main(String[] args) {
        System.out.println("Welcome to palindrome Recursion function");
        Scanner read = new Scanner(System.in);
        System.out.println("Enter the string to be checked: ");
        String str = read.next();
        System.out.println("Yous String is "+((isPlaindrome(str) ? "Palindrome"
                                        :"not palindrome")));
    }
    public static boolean isPlaindrome(String str){
        if (str.length() <=1){
            return true;
        }
        int lastpos = str.length()-1;
        if (str.charAt(0) == str.charAt(lastpos)){
            return false;
        }
        String newStr = str.substring(1,lastpos);
        return isPlaindrome(newStr);
    }
}
