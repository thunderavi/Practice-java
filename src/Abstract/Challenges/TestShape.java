package Abstract.Challenges;

import String_chaleegnege.CircleCurcum;

public class TestShape {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Square square = new Square(10.3);

        System.out.printf("Area of Cicle is %5.2f\n",circle.calculateArea());
        System.out.printf("Area of Square is %5.2f",square.calculateArea());
    }
}
