package String_chaleegnege;

public class ArraywordConcat {
    public static void main(String[] args) {
        String[] arr = new String[]{
                "This" , "is" ,"the" ,
                "best", "best" , "person" , "i" , "ever","meet."
        };
        StringBuilder sb = new StringBuilder();
        for (String str : arr) {
            sb.append(str).append(" ");
        }
        System.out.println(sb);
    }
}
