package Synchronous;

public class Testing_sleep {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        System.out.println("Before sleeping");
        Thread.sleep(10000);
        System.out.println("Woke up");
        long end = System.currentTimeMillis();
        System.out.printf("Time taken: %d Sec",(end-start)/1000);
    }
}
