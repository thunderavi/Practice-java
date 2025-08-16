package Synchronous;

public class TestSync {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdaterTHreaf t1 = new UpdaterTHreaf(counter);
        UpdaterTHreaf t2 = new UpdaterTHreaf(counter);


        try {
            t1.start();
            t2.start();

            t1.join();
            t2.join();
        }catch (InterruptedException e){
            System.out.println("Thread Inteerupted"+e.getMessage());
        }
        long endTIme= System.currentTimeMillis();
        System.out.printf("Final counter value: %d and Time take %d",
                counter.getCount(),(endTIme-start));
    }
}
