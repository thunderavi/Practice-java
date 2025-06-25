package ClasesPackets;

public class practice {
    //instance variable
    int noOfWheels;
    String Colors;
    float maxSpeed;
    float currentFuelInLiters;
    int noOfSeats;


    public void drive(){
        if (currentFuelInLiters <=0){
            System.out.println("Car is out of Fuel");
        } else if (currentFuelInLiters < 5) {
            System.out.println("Car is in reserved mode, please refeul");
        }else{

        System.out.println("Car is Driving");
        currentFuelInLiters--;
        }
    }
    public void addFuel(float fuel){
        currentFuelInLiters +=fuel;
    }
    public float getCurrentFuel(){
        return currentFuelInLiters;
    }

}
