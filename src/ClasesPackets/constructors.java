package ClasesPackets;

import javax.swing.*;

public class constructors {
    String color;
    float price;


    constructors(){
        color = "black";
        price = 50000;
    }

    static int noofCars;

    static {
        noofCars = 0;
        System.out.println("I am in static block");
    }
    {
        noofCars++;
        System.out.println("I am inint BLock");
    }

    public static void main(String[] args) {
        constructors swift = new constructors();
        practice car = new practice();
        System.out.println(car.color);
        System.out.println(swift.price);
        System.out.println(swift.color);
    }
}
