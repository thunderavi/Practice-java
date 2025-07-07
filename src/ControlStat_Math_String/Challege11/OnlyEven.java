package ControlStat_Math_String.Challege11;


public class OnlyEven {
    public static void main(String[] args) {

        System.out.println("Welcome to print Even number");
        for (int i=1;i<=100;i++){
            if (i%2 ==1){
                continue;
            }
            System.out.println(i);
        }
    }
}
