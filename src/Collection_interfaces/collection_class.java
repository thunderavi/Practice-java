package Collection_interfaces;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class collection_class {
    public static void main(String[] args) {
        List<Integer> numList = new ArrayList<>();
        numList.add(5);
        numList.add(2);
        numList.add(8);
        numList.add(-76);
        utiltiy.print(numList);
        Collections.sort(numList);
        utiltiy.print(numList);

        Collections.reverse(numList);
        utiltiy.print(numList);

        List<Integer> unmodified = Collections.unmodifiableList(numList);
        unmodified.add(87);


    }
}
