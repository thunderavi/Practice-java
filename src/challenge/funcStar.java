package challenge;

public class funcStar {
    public static void main(String[] args) {
        printFirstpattern();
        second0pattern();
        Third0pattern();
        System.out.println("New while pattern....");
        whilepatter();
    }
    public static void printFirstpattern(){
        System.out.println("*");
        System.out.println("* *");
        System.out.println("* * *");
    }
    public  static  void second0pattern(){
        System.out.println("* * *");
        System.out.println("* *");
        System.out.println("*");
    }
    public  static  void Third0pattern(){
        System.out.println("* *");
        System.out.println("* * *");
        System.out.println("*");
    }
    public static void whilepatter(){
        int rows =0;
        while (rows < 5){

            int i = 0;
            while (i < rows){
                System.out.print(" *");
                i++;
            }
            System.out.println();
            rows++;
        }
    }

}
