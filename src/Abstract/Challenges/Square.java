package Abstract.Challenges;

public class Square extends Shape {
    private  final double sideinCenter;

    public Square(double sideinCenter) {
        this.sideinCenter = sideinCenter;
    }

    public double getSideinCenter() {
        return sideinCenter;
    }

    @Override
    public double calculateArea() {
        return Math.pow(sideinCenter,2);
    }
}
