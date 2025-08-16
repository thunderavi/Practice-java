package MultiThreading_ORExecuter;

public class Ecten2 extends Thread{

    @Override
    public void run(){
        for (int i = 1; i < 1000; i++) {
            System.out.printf("%d$ ",i);
        }
        System.out.printf("\n%s $ task complete",Thread.currentThread().getName());
    }


}
