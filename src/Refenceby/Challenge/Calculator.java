package Refenceby.Challenge;

public class Calculator {
    public  int add(int a,int b){
        return a+b;
    }
    public  int add(int a,int b,int c){
        return a+b+c;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
//        int sum = add(4,65);
//        int sum2 = add(4,7,6);
//        double sum3 = add(4.3,3.5);


        Calculator calc = new Calculator();
        System.out.println(calc.add(2,3));
        System.out.println(calc.add(2,3,4));
        System.out.println(calc.add(2.3,3.4));

//        System.out.printf("sum of 2 int :%d \n, sum of 3 int : %d " +
//                "\n,Sum of 2 double :%2.3f ",sum,sum2,sum3);


    }
}
