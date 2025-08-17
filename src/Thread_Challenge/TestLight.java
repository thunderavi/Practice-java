package Thread_Challenge;

public class TestLight {
    public static void main(String[] args) throws InterruptedException {
        TrafficLightThread red = new TrafficLightThread(Trafficcolor.RED);
        TrafficLightThread yellow = new TrafficLightThread(Trafficcolor.YELLOW);
        TrafficLightThread green = new TrafficLightThread(Trafficcolor.GREEN);

        green.start();
        green.join();
        yellow.start();
        yellow.join();
        red.start();

    }
}
