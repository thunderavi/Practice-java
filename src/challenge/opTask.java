package challenge;

import java.util.Scanner;

public class opTask {
    public static void main(String[] args) {

        int a=5 ,b=3,c=6,d=7;
        int perimeterofRectangle = a+b+c+d;
        System.out.println("Perimeter of Rectange : "+perimeterofRectangle);

        int B= 10,H=5;
        double area =( 0.5*B*H);
        System.out.println("Area of triangle :"+area );

        int principle=10;
        double time = 7.5;
        double rate = 7.6;
        double SI = (principle*time*rate)/100;
        System.out.println("Simple interest :" + SI);

        double compuntINt= principle*Math.pow((1+rate/100),time);
        System.out.println("Coumpt int :" + compuntINt);


        Scanner read = new Scanner(System.in);
        System.out.print("Enter the Farenheit : ");
        int f= read.nextInt();
        double celcius= (f-32)*0.5;
        System.out.println("The Celsius is :" + celcius);

        System.out.println("Product of two floating number ..");
        System.out.print("Enter first number: ");
        double first = read.nextDouble();
        System.out.print("Enter Second number: ");
        double second = read.nextDouble();

        double result= first*second;
        System.out.println("Product result : "+result);


    }
}
