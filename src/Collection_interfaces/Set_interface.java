package Collection_interfaces;

import javax.swing.text.Utilities;
import java.util.HashSet;
import java.util.Set;

public class Set_interface {
    public static void main(String[] args) {
    Set<String> names = new HashSet<>();
        System.out.println(names.add("Avi"));
        System.out.println(names.add("Ranjan"));
        System.out.println(names.add("Prasad"));
        System.out.println(names);

        System.out.println(names.add("Avi"));
        System.out.println(names.size());
        utiltiy.print(names);

        System.out.println(names.contains("Avi"));
        System.out.println(names.remove("Avi"));
        utiltiy.print(names);
    }

}
