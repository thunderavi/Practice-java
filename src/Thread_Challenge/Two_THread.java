package Thread_Challenge;

import java.lang.management.ThreadInfo;

public class Two_THread extends Thread {
    private final int threadNumber;

    public Two_THread(int threadNumber) {
        this.threadNumber = threadNumber;
    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {
            System.out.printf("(%d) %s Hello from THread -%d\n",(i+1),Thread.currentThread().getName(), threadNumber);
        }
    }
}

