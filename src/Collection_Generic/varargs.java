package Collection_Generic;

public class varargs {
    static void printmay(String ...elements){
        //(...) ellipsis --> introduced in JAVA 5 .
        for (String element : elements){
            System.out.printf(element);
        }
    }

    public static int sum1(int first , int second,int ... a){
        //cant put at start (...) varargs
        int sum1 =first+second;
        for (int i : a) {
            sum1 += i;
        }
        return sum1;
    }


    //simple methods..............................
    public static int sum(int[] a){
        int sum =0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }
    public static int sum(int a, int b){
        return a *b;
    }
    //............................................

    public static void main(String[] args) {
        printmay("one","two","three");
        printmay("one","two");
        printmay();
        printmay(new String[]{"one","two","three"});
        System.out.println(sum(4,5));
        System.out.println(new int[]{4});
        System.out.println(sum1(4,5,6,5,3));
    }
}
