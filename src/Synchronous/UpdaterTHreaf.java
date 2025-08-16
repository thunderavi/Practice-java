package Synchronous;

public class UpdaterTHreaf extends Thread {
    private final Counter counter;

    public UpdaterTHreaf(Counter counter){
        this.counter= counter;
    }
    @Override
    public void run(){
        for (int i = 0; i < 1000; i++) {
            counter.increment();
        }
    }
}
