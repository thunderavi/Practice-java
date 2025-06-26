package ClasesPackets;

public class Driver {
    static int minAverage = 18;

    String name;
    String dateOfLicence;
    int age;

    public boolean isAllowedToDrived(){
        return this.age >= minAverage;
    }

    public static void main(String[] args) {
//        practice mycar = new practice();  //mycar is refernce ,car() is constructor
//        mycar.addFuel(6);
//        mycar.drive();
//        mycar.drive();
//        mycar.drive();
//        mycar.drive();
//        System.out.println( mycar.getCurrentFuel());

        practice swift = new practice("Red");
        constructors thar = new constructors();
        swift.addFuel(6);
        practice startedcar =swift.start();
        startedcar.drive();

        Driver mydriver = new Driver();
        mydriver.dateOfLicence="1/jan/2024";

    }
}
