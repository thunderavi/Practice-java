package challenge;

import java.util.Scanner;

public class locgicalt6 {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Age : ");
        int age= read .nextInt();
        String data;
        if (age >= 60){
            data = "Senior";
        } else if (age <= 60 ) {
            data = "Adult";
        } else if (age >= 20) {
            data = "Teen";
        }else {
            data = "Child";
        }
        System.out.println("you are :" +age + " is of "+data);
    }
}
