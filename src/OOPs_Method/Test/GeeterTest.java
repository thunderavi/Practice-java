package OOPs_Method.Test;

import OOPs_Method.GeeterSeeter.Car;

public class GeeterTest
{
        public static void main(String[] args) {

        Car car = new Car("Red",
                "swift",12,
                134);
        car.setColor("yellow");
                System.out.printf("%s %s",car.getModel(),car.getColor());
        }

}
