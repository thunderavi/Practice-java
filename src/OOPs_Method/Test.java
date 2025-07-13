package OOPs_Method;

public class Test {
    public static void main(String[] args) {
        Car car = new Car();
        car.color="Red";
        car.model="Swift";
        System.out.println(car);
//        car.costOfPurchase ; private
        Car newCar = new Car("Black","BMW",
                1,5000);
        System.out.println(newCar);
    }
}
