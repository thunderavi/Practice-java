package ControlStat_Math_String;

public class Breakprogram {
    public static void main(String[] args) {
//        for (int i=1;i< 1000;i++){
//            if (i == 101){
//                break;
//            }
//            System.out.println(i);
//        }
//        System.out.println("out for loop");

        System.out.println("Before loop");
        for (int i=1;i< 10;i++){
            if (i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("out for loop");
    }
}
