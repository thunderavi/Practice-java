package ClasesPackets;

import java.security.PublicKey;

public class practice {
    //instance variable
    int noOfWheels;
    String Colors;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;
    String color;

    practice(String color){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }
    practice(){
        noOfWheels = 4;
        this.color = color;
        maxSpeed = 150;
        currentFuelInLiters = 2;
        noOfSeats = 5;
    }

    public practice start(){

            int pop =5;
        if (currentFuelInLiters <=0){
            System.out.println("Car is out of Fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refeul");
        }else{

        System.out.println("Car is Starting ... Bhr..........");

        }
        System.out.println(pop);
        return this;
    }

    public void drive(){

            currentFuelInLiters--;
            System.out.println("Car is Driving");

    }
    public void addFuel(float currentFuelInLiters){
       this.currentFuelInLiters += currentFuelInLiters;
    }
    public float getCurrentFuel(){
        return currentFuelInLiters;
    }

}
