package day7.demo;

/**
 * Created by Administrator on 14-4-19.
 */
public class Fibonacci {

    public static int compute(int n) {
//        Ctrl+Alt+t
        if (n == 1 || n == 2) {
            return 1;
        } else {
            return compute(n - 1) + compute(n - 2);//return c(3) + c(2)
        }
    }

    public static void main(String[] args) {

        int n = 32;
        System.out.println(compute(n));
    }
}
