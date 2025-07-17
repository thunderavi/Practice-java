package Abstract;

public abstract class Vehicle implements Transport {// abstract help me to not use parent class
//    and the Teastabtract uses Car which inherit the Vehicle
    private int noOfTyres;

    public abstract void makeStaretsound();



    public Vehicle(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }


    public int getNoOfTyres() {
        return noOfTyres;
    }

    public void setNoOfTyres(int noOfTyres) {
        this.noOfTyres = noOfTyres;
    }

    public void commute(){
        System.out.println("Going......");
    }

    @Override
    public void getSetGo() {
        System.out.println("Goinf to place/...");
    }
}
