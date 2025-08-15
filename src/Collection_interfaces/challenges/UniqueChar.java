package Collection_interfaces.challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueChar {
    public static void main(String[] args) {
        Set<Character> unique = new HashSet<>();
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your String :");
        String usrStr= input.next();

        for (char c : usrStr.toCharArray()) {
            unique.add(c);
        }
        System.out.printf("your String had %d Unique charachter",unique.size());
    }
}
