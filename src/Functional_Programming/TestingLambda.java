package Functional_Programming;

public class TestingLambda {
    public static void main(String[] args) {
        System.out.println("Helllo");
        TestingLambda test= new TestingLambda();
        int sum = test.sum(6,7);
        test.printString("This is the best SUM");

//         toPrint -> System.out.println(toPrint);
//        (a.b) -> {
//        int sum = a+b;
//            System.out.println(sum);
//        }
}

    public void printString(String toPrint){
        System.out.println(toPrint);
    }
    public int sum(int a ,int b){
        int sum =a+b;
        return sum;
    }
}
