package day7.demo;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-19.
 */
//题目3：将一个正整数分解质因数。例如：输入90,打印出90=2*3*3*5。
//    10=2*5
//    56=2*28 28=2*14 14=2*7
public class E3 {

    public static void factor(int n) {
        for (int i = 2; i < n+1; i++) {
            if (n%i == 0 && isPrime(i)) {
                System.out.print(i);
                if (n != i) {
                    System.out.print("*");
                }
                factor(n/i);
                break;
            }
        }
    }

    public static boolean isPrime(int n) {
        for (int j = 2; j < n / 2 + 1; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("input N:");
        int n = new Scanner(System.in).nextInt();
        System.out.print(n + " = ");
        factor(n);
    }
}
