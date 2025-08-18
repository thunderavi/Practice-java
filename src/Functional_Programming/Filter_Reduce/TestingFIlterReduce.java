package Functional_Programming.Filter_Reduce;

import java.util.List;
import java.util.function.Consumer;

public class TestingFIlterReduce {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple","banana","mango","cherry","date");
        System.out.println(fruits.size());
        System.out.println("Nomal printing .....................");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
        System.out.println("Using stream............");
        fruits.stream().forEach(new Consumer<String>() {
            @Override
            public void accept(String fruit) {
                System.out.println(fruit);
            }
        });
        System.out.println("Single method.........");
        fruits.stream()
                .filter(fruit -> fruit.endsWith("a"))
                .forEach(fruit -> System.out.println(fruit));
    }
}
