package nested;

public class Car {
    private int noOfDOors;

    public void start(){
        Tyre t = new Tyre();
    }
    protected class Tyre {
        private double width;
        private double pressure;
        private String material;

       public void inflate(){
           noOfDOors =4;
       }
    }
}
