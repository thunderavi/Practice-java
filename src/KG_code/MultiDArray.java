package KG_code;

public class MultiDArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4},{3,4,6},{7,8,9}};
        System.out.println(arr[0][1]);
// homogenoius array means all data availabe in array
        // heterogenoius array means some feild in array is empty

        // travelsal in 2D array
        int i =0;
        while (i<arr.length){
            int j =0;
            while (j <arr[i].length){
                System.out.print(arr[i][j]+ " ");
                j++;
            }
            System.out.println();
            i++;
        }
    }
}
