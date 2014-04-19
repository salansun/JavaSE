package day7.demo;

/**
 * Created by Administrator on 14-4-19.
 */

//题目：打印出如下图案（菱形） (n)
//    *
//   ***
//  *****
// *******
//*********
// *******
//  *****
//   ***
//    *

//        System.out.print(" ");
//        System.out.print("*");
//        System.out.println("*");

public class Shape {
    public static void main(String[] args) {
        int n = 99;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < ((i < n / 2 + 1) ? (n / 2 - i) : (i - (n / 2 + 1) + 1)); j++) {
                System.out.print(" ");
            }
            for (int k = 0; k < ((i < n / 2) ? (i * 2) : ((n - 3) - (i - (n / 2 + 1)) * 2)); k++) {
                System.out.print("*");
            }
            System.out.println("*");
        }
    }
}
