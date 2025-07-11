package StringMethod;

public class StringFormat {
    public static void main(String[] args) {
        int marks =45;
        String name = "Sand";
        System.out.println("Hello "+name+" your marks are : "+45);

        // Use printf %s --> string and %d --> int  for %S for uppercase
        // --> %-10S means 10 space and uppercase.
        System.out.printf("Hello %s, your marks are: %d", name, marks);
    }
}
