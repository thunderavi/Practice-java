package MultiThreading_ORExecuter;

public class Exten_THread extends Thread{

    @Override
    public void run(){

        //first task
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d* ",i);
        }
        System.out.printf("\n%s * task complete",Thread.currentThread().getName());
    }



}
