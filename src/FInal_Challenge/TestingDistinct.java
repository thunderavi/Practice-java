package FInal_Challenge;

import java.util.List;
import java.util.stream.Collectors;

public class TestingDistinct {
    public static void main(String[] args) {
    List<Integer> number = List.of(1,2,3,4,5,3,4,2,6,2);
        List<Integer> distinct = number.stream()
                .distinct()
                .collect(Collectors.toList());
        System.out.println(number);
        System.out.println(distinct);
    }

}
