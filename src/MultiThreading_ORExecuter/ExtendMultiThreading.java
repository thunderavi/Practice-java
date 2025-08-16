package MultiThreading_ORExecuter;

public class ExtendMultiThreading {
    public static void main(String[] args) {

        long startTime =System.currentTimeMillis();

        Exten_THread t1 = new Exten_THread();
        Ecten2 t2= new Ecten2();
        Extend3 t3 =new Extend3();
        System.out.println("\n Starting First Thread");
        t1.start();
        System.out.println("\n Starting Second Thread");
        t2.start();
        System.out.println("\n Starting Third Thread");
        t3.start();

        long endtime = System.currentTimeMillis();
        System.out.printf("%s Total time taken: %d Sec",Thread.currentThread().getName(),(endtime-startTime));
    }
}
