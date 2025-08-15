package Collection_interfaces.challenges;

class concateString {

    public static void main(String[] args) {
        System.out.println(concatinate("Avi"));
        System.out.println(concatinate("Ranjan","prasad"));
        System.out.println(concatinate("Subscribe","to","upcoming"));
    }
    public static String concatinate(String... strs){
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(str).append(" ");
        }
        return sb.toString();
    }
}
