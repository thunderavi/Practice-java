package Thread_Challenge;

public enum Trafficcolor {
    RED(9000),YELLOW(1000) ,GREEN(3000);

    private final int OntimingMillis;

    public int getOntimingMillis() {
        return OntimingMillis;
    }

    Trafficcolor(int ontimingMillis) {
        OntimingMillis = ontimingMillis;
    }
}
