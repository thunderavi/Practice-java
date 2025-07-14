package OOPs_Method.Inheritance;

public class InheritanceTest {
    public static void main(String[] args) {

    Vehicle vehicle = new Vehicle();
    TwoWheeler two = new TwoWheeler();

    vehicle.commute();
    two.commute();

    MotorCycle motoer = new MotorCycle();
    motoer.commute();
    motoer.balance();
    motoer.start();

        System.out.println(vehicle.toString());
        System.out.println(vehicle.hashCode());
        System.out.println(vehicle.getClass());

    }


}
