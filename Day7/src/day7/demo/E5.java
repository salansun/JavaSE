package day7.demo;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-19.
 */

//题目5：输入两个正整数m和n，求其最大公约数和最小公倍数。

//    20 10
public class E5 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("input M:");
        int m = scanner.nextInt();
        System.out.println("input N:");
        int n = scanner.nextInt();

        M1(m, n);
        M2(m, n);

    }

    private static void M2(int m, int n) {
        //min
        for (int i = Math.max(m, n); i < m*n + 1; i++) {
            if (i % m == 0 && i % n ==0) {
                System.out.println(i);
                break;
            }
        }

    }

    private static void M1(int m, int n) {
        //max
        for (int i = Math.min(m, n); i > 0; i--) {
            if (m % i == 0 && n % i ==0) {
                System.out.println(i);
                break;
            }
        }
    }
}
