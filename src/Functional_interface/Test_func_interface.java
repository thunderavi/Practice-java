package Functional_interface;

import java.util.List;
import java.util.function.BinaryOperator;

public class Test_func_interface {


        public static void main(String[] args) {
            List<Integer> numbers = List.of(1,3,4,2,5,6,3);


            // this is called method reference
            numbers.stream()
                    .filter(num -> num % 2 ==1)
                    .forEach(System.out::println);


            numbers.stream()
                    .filter(num -> num % 2 ==1)
                    .forEach(num -> System.out.println(num));
//            //Small form
//            int newsum2 = numbers.stream()
//                    .reduce(0,(a, b) -> a+b);
//            System.out.println(newsum2);



        }
    }


