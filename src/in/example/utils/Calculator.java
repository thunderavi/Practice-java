package in.example.utils;

import in.example.geometry.Circle;
import in.example.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args) {
        Circle cir = new Circle(5.5);
        Rectangle rect = new Rectangle(10,5);

        double CirArea = Math.PI * Math.pow(cir.radius, 2);
        double rectArea = rect.breadth * rect.length;

        System.out.printf("Area of Circle is :%s , \n " +
                "Area of the Rectangle is : %s",CirArea,rectArea);
    }
}
