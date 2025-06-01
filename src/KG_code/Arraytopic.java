package KG_code;

public class Arraytopic {
    public static void main(String[] args) {
        int[] myarray = new int[5];
//        myarray[0] = 98;
//        myarray[1] = 68;
//        myarray[2] = 38;
//        myarray[3] = 18;
//        myarray[4] = 78;
        int[] myarr = {45,35,36,366,36};
//        int index =2;
//        System.out.println(myarr[0]);
//        System.out.println(myarr[1]);
//        System.out.println(myarr[index]);
//        System.out.println(myarr[3]);
//        System.out.println(myarr[4]);


        // Array traversal - means to take a round to array
        int index =0 ;
        while (index < myarr.length){
            System.out.println(myarr[index]);
            index++;
        }
    }
}
