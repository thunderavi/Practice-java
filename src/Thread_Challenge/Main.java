package Thread_Challenge;

public class Main {
    public static void main(String[] args) {
        Two_THread t1 = new Two_THread(1);
        Two_THread t2 = new Two_THread(2);

        t1.start();
        t2.start();
    }
}
