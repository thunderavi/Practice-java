package FInal_Challenge;

import java.util.List;

public class TestingSOrting {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Avi",100),
                new Employee("RAvi",200),
                new Employee("Kavi",130),
                new Employee("Teja",140),
                new Employee("Ram",120)
        );
        employees.stream()
                .sorted((emp1,emp2)-> Integer.compare(emp1.getSalary(),emp2.getSalary()))
                .forEach(System.out::println);

    }
}
