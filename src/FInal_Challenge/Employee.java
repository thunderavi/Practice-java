package FInal_Challenge;

public class Employee {
    private final String name;
    private final int Salary;

    public Employee(String name, int salary) {
        this.name = name;
        Salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return Salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", Salary=" + Salary +
                '}';
    }
}
