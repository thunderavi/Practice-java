package String_chaleegnege;

public class DICE {
    int roll(){
        double random = Math.ceil(Math.random() * 6 );
        return (int)random;
    }
    public static void main(String[] args) {
        DICE dice = new DICE();
        for (int i = 0; i < 10; i++) {
            System.out.println(dice.roll());
        }
    }
}
