/**
 * Created by Administrator on 14-3-29.
 */
public class Poly {

//    overload
    int square(double y, int x) {
        return x * x;
    }

    String square(int y, double x) {
        return "hello";
    }

    public static void main(String[] args) {
        Poly poly = new Poly();
        System.out.println(poly.square(2, 3.4));
    }
}
