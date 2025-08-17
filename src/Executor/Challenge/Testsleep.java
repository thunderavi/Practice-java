package Executor.Challenge;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class Testsleep {
    public static void main(String[] args) {
        ExecutorService service = Executors.newFixedThreadPool(3);
        try {
            for (int i = 0; i < 10; i++) {
                SleepTask task = new SleepTask();
                service.submit(task);
            }
            service.shutdown(); // must shutdown before awaitTermination
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) {
                System.out.println("\n Ememrcngy shut down!!!");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // fixed typo
        }
    }
}
