package in.example.EmployePractive;

public class TestEmployee {
    public static void main(String[] args) {

    Employee emp = new Employee("Avi",24,300000);
        System.out.println(emp.getEmployeeDetails());
        emp.setName("Golu");
        System.out.println(emp.getEmployeeDetails());
    }
}
