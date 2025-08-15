package Collection_interfaces.challenges;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Ele_reverse {
    public static void main(String[] args) {
        List<Integer> lisr = Arrays.asList(1,2,3,4,5,6,7,8);
        System.out.println(lisr);
        reverse(lisr);
        System.out.println(lisr);
    }

    public static void reverse(List<Integer> list) {
//        Collections.reverse(list);
        for (int i = 0; i < list.size()/2; i++) {
            ListSwapping.swap(list,i,list.size()-1 -i);
        }
    }
}
