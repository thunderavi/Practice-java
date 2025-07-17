package Abstract;

import java.security.PublicKey;

public class Car extends Vehicle  {

    private int noOfDoors;


    public Car(){
        super(4);
    }

    @Override
    public void makeStaretsound() {
        System.out.println("Vroom .......");
    }
}
