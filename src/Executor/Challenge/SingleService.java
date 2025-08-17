package Executor.Challenge;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleService {
    public static void main(String[] args) {
        // Create a single-thread executor
        ExecutorService service = Executors.newSingleThreadExecutor();
        try {
            // Assuming SINGLE_exe implements Runnable
            SINGLE_exe task = new SINGLE_exe();
            service.submit(task);
        } finally {
            // Always shut down the executor
            service.shutdown();
        }
    }
}
