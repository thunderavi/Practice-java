package Collection_interfaces;

import java.util.ArrayList;
import java.util.List;

public class List_interface {
    public static void main(String[] args) {
        List StringList = new ArrayList<>();
        //to add String in list .add();
        StringList.add("AviRanjan");
        StringList.add("Prasad");


        //to remove use .remove() at specific index
        StringList.remove(0);

        if (StringList.contains("Prasad")){
            System.out.println("prasad exists");
        }

        if (StringList.contains("Prasad")){
            System.out.println(StringList.indexOf("Prasad"));
        }

        //add something in String using .add(index, value)
        StringList.add(1,"coding");
        for (int i = 0; i < StringList.size(); i++) {
            System.out.print(StringList.get(i));
        }
//        for (String str: StringList){
//            System.out.println(str);
//        }


    }
}
