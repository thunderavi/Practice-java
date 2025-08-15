package MultiThreading_ORExecuter;

public class NeedOfMultiThreading {
    public static void main(String[] args) {

        long startTime =System.currentTimeMillis();
        //first Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.println("\n FIrst Task Complete");

        //Second Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.println("\n Second Task Complete");

        //Third Task
        for (int i = 1; i <= 1000; i++) {
            System.out.printf("%d# ",i);
        }
        System.out.println("\n Third Task Complete");
        long endtime = System.currentTimeMillis();
        System.out.printf("Total time taken: %d Sec",(endtime-startTime));
    }
}
