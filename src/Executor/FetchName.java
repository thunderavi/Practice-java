package Executor;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {
    private final String name;

    public FetchName(String name) {
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\n Getting Full name of %s from server",name);
        Thread.sleep(4000); // simulate some delay
        return name + " Bhartiya";
    }
}
