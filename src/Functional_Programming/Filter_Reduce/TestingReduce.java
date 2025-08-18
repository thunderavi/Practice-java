package Functional_Programming.Filter_Reduce;

import java.util.List;
import java.util.function.BinaryOperator;

public class TestingReduce {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,3,4,2,5,6,3);
        int sum = 0;
        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println(sum);

        int newsum = numbers.stream()
                .reduce(0, new BinaryOperator<Integer>() {
                    @Override
                    public Integer apply(Integer integer, Integer integer2) {
                        return integer+ integer2;
                    }
                });
        System.out.printf("\n sum using reduce is %d ",newsum);


        //Small form
        int newsum2 = numbers.stream()
                .reduce(0,(a, b) -> a+b);
        System.out.println(newsum2);


        int max = numbers.stream()
                .reduce(Integer.MAX_VALUE,(a, b) -> a > b ? a:b);
        System.out.println(newsum2);
    }
}
