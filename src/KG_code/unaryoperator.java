package KG_code;

public class unaryoperator {
    public static void main(String[] args) {
        int x =5;
        int y = -x;
        int z = -y;
        System.out.println(z);

        int a =5;
        a = a +1 ;
        System.out.println(a);
        a += 1 ;
        System.out.println(a);
        a++;
        System.out.println(a);
        ++a;

        System.out.println("Watch increment");
        int p =5;
        System.out.println(p++);
        System.out.println(p);

        System.out.println(++p);
        System.out.println(p);


        System.out.println("new decrement");
        int q =10;
        System.out.println(--q);
        System.out.println(q);

        System.out.println(q--);
        System.out.println(q);
    }
}
