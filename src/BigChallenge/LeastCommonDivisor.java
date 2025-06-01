package BigChallenge;

import java.util.Scanner;

public class LeastCommonDivisor {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the Least common Multiple (LCM)");
        System.out.print("Enter First number :");
        int first = read.nextInt();
        System.out.print("Enter Second number :");
        int Second = read.nextInt();
        int total= LCM(first,Second);
        System.out.println("LCM result is "+total);
    }
    public static int LCM(int first, int second){
        int max = Math.max(first,second);
        while (true){
            if (max % first == 0 && max % second == 0){
                break;
            }
            max++;
        }
        return max;
    }
}
