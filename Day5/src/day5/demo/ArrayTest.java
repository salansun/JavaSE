package day5.demo;

/**
 * Created by Administrator on 14-4-12.
 */
public class ArrayTest {

    private static final int[] X_ARRAY = {1, -1, 0};//
    private static final int X = 123;

    public static void main(String[] args) {
        int[] c = new int[12];
        c[11] = 100;
        System.out.println(c[11]);
        System.out.println(c.length);

        String[] strings = new String[100];
        System.out.println(strings[strings.length - 1]);

        boolean[] booleans = new boolean[10];
        System.out.println(booleans[0]);

        double[] squares = new double[10];

//        itar iterate array
        System.out.println("---------------");
        for (int i = 0; i < squares.length; i++) {
            squares[i] = i * i;

            System.out.println(squares[i]);
        }
        System.out.println("---------------");
        System.out.println(squares);// 81 100 0

        int[] n = {1, -2345, 5, 689};
        n[3] = 100;
        System.out.println(n[3]);

        X_ARRAY[0] = 1000;

        System.out.println(X_ARRAY[2]);

//        X = 456;


        double[] doubles = new double[100];//
        for (int i = 0; i < doubles.length; i++) {
            double aDouble = doubles[i];
            System.out.println(aDouble);
        }
    }
}
