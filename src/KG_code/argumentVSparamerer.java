package KG_code;

public class argumentVSparamerer {
    public static void main(String[] args) {

        System.out.println(  sumTwoNumber(5,5));
        System.out.println(  sumTwoNumber(8,5));
    }
    public static int sumTwoNumber(int first, int second){
        System.out.println("First number received .... : "+first);
        System.out.println("Second number received .... : "+second);
        int sum = first + second;
        return sum;
    }
}
