package KG_code;

import java.util.Scanner;

public class loopjava {
    public static void main(String[] args) {
//        int num = 1;
//        while (num <= 10){
//            System.out.println(num);
//            num = num + 1;
//        }
//
//        int count = 500;
//        while (count >= 200){
//            System.out.println(count);
//            count = count - 1;
//        }
        Scanner read = new Scanner(System.in);
        int i =0 ;
        while (i < 5){
            int inp = read.nextInt();
            System.out.println("Number is :" + inp);
            i += 1;

        }
    }
}
