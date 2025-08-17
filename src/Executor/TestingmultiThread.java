package Executor;

import MultiThreading_ORExecuter.RUnnable.PrintTask;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class TestingmultiThread {
    public static void main(String[] args) throws InterruptedException {
       ExecutorService service= Executors.newFixedThreadPool(3);

        for (int i = 0; i < 10; i++) {
            PrintTask task = new PrintTask((char) i);
            service.submit(task);
        }
//        PrintTask task1 = new PrintTask('*');
//        PrintTask task2 = new PrintTask('$');
//        PrintTask task3 = new PrintTask('#');

//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);

        service.shutdown();
        System.out.println("\n***********************");
      if(!service.awaitTermination(10, TimeUnit.SECONDS)){
          System.out.println("\n***********************");
          service.shutdownNow();
      }

    }
}
