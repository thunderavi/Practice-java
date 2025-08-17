package Executor;

import java.util.concurrent.*;

public class TestingFutures {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(1);
       FetchName task1 = new FetchName("AviRanjan");
       FetchName task2 = new FetchName("Prasad");
        FetchName task3 = new FetchName("KG Coding");
        FetchName task4 = new FetchName("Subscribe");

        Future<String> name1 = service.submit(task1);
        Future<String> name2 = service.submit(task1);
        Future<String> name3 = service.submit(task1);
        Future<String> name4 = service.submit(task1);

        System.out.printf("\nFull name is : %s", name1.get());
        System.out.printf("\nFull name is : %s", name2.get());
        System.out.printf("\nFull name is : %s", name3.get());
        System.out.printf("\nFull name is : %s", name4.get());

        service.shutdown();

    }
}
