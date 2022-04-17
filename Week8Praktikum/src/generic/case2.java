package generic;

public class case2 {
    public static void main(String[] args) {
        Point[] a = new Point[10];
        Object[] b;
        b = a;
        b[0] = new Point(10,20);
        System.out.println(a);
        System.out.println(b);        
    }
}