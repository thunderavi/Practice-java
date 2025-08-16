package Joins;

import MultiThreading_ORExecuter.RUnnable.PrintTask;

public class TestingJoin {
    public static void main(String[] args) throws InterruptedException {

        long starttime= System.currentTimeMillis();
    PrintTask p1 = new PrintTask('*');
    PrintTask p2 = new PrintTask('$');
    PrintTask p3 = new PrintTask('#');

    Thread t1 = new Thread(p1);
    t1.start();
        System.out.println("\nThread one stated");
        Thread t2 = new Thread(p2);
        t2.start();
        System.out.println("\n THread 2 Started");
        t1.join();
        Thread t3 = new Thread(p3);
        t3.start();
        System.out.println("\n Thread 3 started");
        long endTime = System.currentTimeMillis();
        System.out.printf("%s Totoal time taken: %d",Thread.currentThread().getName(),(endTime-starttime));
    }
}
