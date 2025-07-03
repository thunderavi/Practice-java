package ControlStat_Math_String;

public class forEachloop {
    public static void main(String[] args) {
        String[] array = new String[]{
                "Ram","Shyam","Mohan","Sohan","Sita","Geeta"
        };
        printaraay(array);
        System.out.println("......New foreach...........................");
        printaraayForEach(array);
    }
    public static void printaraay(String[] array){
        for (int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void printaraayForEach(String[] array){
        for (String name : array){
            System.out.println(name);
        }
    }
}
