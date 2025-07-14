package OOPs_Method.Inheritance;

public class TwoWheeler extends Vehicle {
        public TwoWheeler(){
            setNumberOfTyres(2);//using private
            // from prime parent as a child
            numberOfTyres = 4; // access through protected.
        }

        public void balance(){
            System.out.println("I am balancing from 2 tyres");
        }
}
