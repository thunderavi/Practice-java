package Executor.Challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static java.util.concurrent.Executors.newFixedThreadPool;

public class TestingCallable {
    public static void main(String[] args) {
        ExecutorService service = newFixedThreadPool(3); // ❌ not AutoCloseable
        try {
            List<Future<Integer>> list = new ArrayList<>();
            for (int i = 0; i < 10; i++) {
                Callable_fact task = new Callable_fact(i);
                list.add(service.submit(task)); // ✅ store futures
            }

            for (Future<Integer> future : list) {
                try {
                    System.out.printf("\n Result is : %d", future.get()); // ✅ call get()
                } catch (ExecutionException e) {
                    e.printStackTrace();
                }
            }

            service.shutdown(); // ✅ request shutdown
            if (!service.awaitTermination(10, TimeUnit.SECONDS)) { // ✅ reversed logic
                System.out.println("Bohot hua stop.....");
                service.shutdownNow();
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e); // ✅ e defined
        }
    }
}
