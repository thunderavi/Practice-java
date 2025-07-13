package OOPs_Method.GeeterSeeter;

public class Car {
    private String color;       //public

    private String model;           //public

    private double fuelLevel;

    private long costOfPurchase;        //default


    public Car(String color, String model, double fuelLevel, long costOfPurchase) {
        this.color = color;
        this.model = model;
        this.fuelLevel = fuelLevel;
        this.costOfPurchase = costOfPurchase;
    }

    public String getColor(){
        return color;
    }

    public String getModel(){
        return model;
    }

    public void setColor(String color){
        if (color.equals("yellow")){
            System.out.println("Pagal hai kya");
        }else {
            this.color= color;
        }
    }
}
