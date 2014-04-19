package day7.demo;

/**
 * Created by Administrator on 14-4-19.
 */
public class Hanoi {

    private static int counter = 0;

    public static void move(int n, char from, char use, char to) {

        if (n == 1) {
            System.out.println(from + "\t--->\t" + to);
            counter++;
        } else {
            move(n-1, from, to, use);
            System.out.println(from + "\t--->\t" + to);
            counter++;
            move(n-1, use, from, to);
        }
    }

    public static void main(String[] args) {
        int n = 21;
        move(n, 'A', 'B', 'C');
        System.out.println(counter);
    }
}
