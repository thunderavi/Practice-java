package Refenceby;

public class passByReference {

    public static void main(String[] args) {
        Point first = new Point(4,8);
        System.out.println("first" + first);
        move(first);
        System.out.println("first " + first);
    }
    public static void move(Point p){
        p.x++;
        p.y++;
        System.out.println(p);
    }

    public static class Point {
        int x;
        int y;

        public Point(int x ,int y){
            this.x=x;
            this.y=y;

        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Point{");
            sb.append("X =").append(x);
            sb.append("; y=").append(y);
            sb.append('}');
            return sb.toString();
        }
    }
}
