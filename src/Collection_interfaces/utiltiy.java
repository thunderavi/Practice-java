package Collection_interfaces;

import java.util.Collection;

public class utiltiy {
    public static <E> void print(Collection<E> collection){
        System.out.println("Collection is: ");
        for (E col : collection) {
            System.out.printf("%s",col);
        }
        System.out.println();
    }
}
