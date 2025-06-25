package ClasesPackets;

public class Driver {

    public static void main(String[] args) {
        practice mycar = new practice();  //mycar is refernce ,car() is constructor
        mycar.addFuel(6);
        mycar.drive();
        mycar.drive();
        mycar.drive();
        mycar.drive();
        System.out.println( mycar.getCurrentFuel());
    }
}
