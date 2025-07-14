package OOPs_Method.Inheritance;

public class Vehicle {
    protected int numberOfTyres;      //in class only to acess use-
                                    // setter and getter

    public void setNumberOfTyres(int numberOfTyres){
        this.numberOfTyres=numberOfTyres;
    }
    public void commute(){
        System.out.printf("I am going " +
                "from Place A to B using %d tires \n",numberOfTyres);
    }
}
