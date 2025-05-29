package KG_code;

import java.util.Scanner;

public class ifelseprogram {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        boolean isMale = false;
        String name = "Bob";
// if there is no bakcets in if-else then it wxecute in a single time only.

        if (isMale){
            System.out.println("Mr. " +name);
        }
        else {
            System.out.println("Ms." +name);
        }

        boolean isSenior = true;
        boolean isAdult = false;
        if (isSenior){
            System.out.println("Hello Senior Citizen");
        }else if (isAdult){
            System.out.println("Hello Adult");
        }else {
            System.out.println("Hello child");
        }
    }
}
