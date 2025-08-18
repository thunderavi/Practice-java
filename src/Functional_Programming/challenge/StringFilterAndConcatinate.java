package Functional_Programming.challenge;

import java.util.List;

public class StringFilterAndConcatinate {
    public static void main(String[] args) {
        List<String> strs = List.of("Prashant","is teaching java","OK programing is goinf on",
                "Thik hai java","Hello world");
       String result = strs.stream()
                .filter(str -> str.length() > 10)
                .reduce("",(a,b) -> a + " "+b);
        System.out.println(result);
    }
}
