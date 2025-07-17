package Abstract;

public class TestAbstract {
    //no direct use of parent only take child, where child use parent
    public static void main(String[] args) {
//        Vehicle veh = new Vehicle(2);
        Car car = new Car();
        car.commute();
        car.makeStaretsound();
    }
}
