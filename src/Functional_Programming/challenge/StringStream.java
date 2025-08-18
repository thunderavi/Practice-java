package Functional_Programming.challenge;

import java.util.List;

public class StringStream {
    public static void main(String[] args) {
        List<String> names = List.of("Avi","Arti","Sanchit","Kg coding");
        names.stream()
                .forEach(name -> System.out.println(names));
    }
}
