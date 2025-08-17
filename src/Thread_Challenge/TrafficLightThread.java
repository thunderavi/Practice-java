package Thread_Challenge;

public class TrafficLightThread extends Thread{
    private final Trafficcolor color;

    public TrafficLightThread(Trafficcolor color) {
        this.color = color;
    }

    @Override
    public void run() {
        System.out.printf("%s \n active",color);
        try {
            Thread.sleep(color.getOntimingMillis());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.printf("%s Inactive\n",color);
    }
}

