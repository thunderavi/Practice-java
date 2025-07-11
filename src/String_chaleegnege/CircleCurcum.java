package String_chaleegnege;

import java.util.Scanner;

public class CircleCurcum {
    double radiusInMilli;
        CircleCurcum(double radiusInMilli){
            this.radiusInMilli=radiusInMilli;
        }

    double getCircumference(){
        return  2 *radiusInMilli* Math.PI;
    }

    double getArea(){
        return  Math.PI * Math.pow(radiusInMilli,2);
    }

    @Override
    public String toString() {
        return "Circle Props :  Radous in mm :" + radiusInMilli +
                ", Corcumference in mm :"+ getCircumference()+
                ", Area in mm2 :" + getArea();
    }

    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        System.out.println("Welcome to the world of circel");
        System.out.print("Please enter your radius :");
        double radius = read.nextDouble();
        CircleCurcum circle = new CircleCurcum(radius);
        System.out.println(circle);

    }
}
