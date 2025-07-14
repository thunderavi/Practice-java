package Equals;

import java.time.Period;

public class EqualsTest {
    public static void main(String[] args) {
        Person person = new Person("Avi",31,"001");
        Person person2 = new Person("Avi",31,"001");

        if (person.equals(person2)){
            System.out.println("Equals");
        }else {
            System.out.println("Not equal");
        }

        if (person == person2){
            System.out.println("Equals =");
        }else {
            System.out.println("Not equal");
        }
    }
}
