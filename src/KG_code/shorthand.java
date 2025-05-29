package KG_code;

import java.util.Scanner;

public class shorthand {
    public static void main(String[] args) {
        int a =5;
        Scanner read = new Scanner(System.in);
        int x1=read.nextInt();
//        a = a + x1;
        a += x1; // shorthand operator
        System.out.println(a);
        int x2=read.nextInt();
        a += x2;
        System.out.println(a);
        int x3=read.nextInt();
        a += x3;
        System.out.println(a);
        int x4=read.nextInt();
        a += x4;
        System.out.println(a);

    }
}
