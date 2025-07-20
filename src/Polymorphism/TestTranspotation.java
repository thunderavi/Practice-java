package Polymorphism;

public class TestTranspotation {
    public static void main(String[] args) {
        Car c = new Car();
        Vehicle v = new Vehicle();

        Vehicle vCar = new Car();  // reference is Vehicle
        // and giving it to Car

        castTest(v);
        castTest(c);

      //  Car cVehicle = (Car) new Vehicle(); //Casting but we can not make casr child to parent

//        Object ref = new Car();
    }
    private static void castTest(Vehicle veh){
        veh.start();
        Car cVehicle = (Car) veh;
        cVehicle.start();
    }
}
