package Collection_interfaces;

import java.util.HashMap;
import java.util.Map;

public class Map_Interface {
    public static void main(String[] args) {

    Map<String,Integer> map = new HashMap<>();
    map.put("Apple",10);
    map.put("Banana",10);
    map.put("orange",10);
        System.out.println(map.size());
    System.out.println(map);

    Integer applecount = map.get("Apple");
        System.out.println("Apple count "+applecount);

        if (map.containsKey("Banana")){
            System.out.println("Banana is in the map");
        }
        map.remove("orange");
        System.out.println(map);

        for (String key : map.keySet()) {
            System.out.printf("%s : %s\n",key ,map.get(key));
        }
    }


}
