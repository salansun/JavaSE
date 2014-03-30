//
package test;

import cn.edu.tsinghua.training.javase.day4.demo.*;

import java.util.Scanner;
//import cn.edu.tsinghua.training.javase.day4.demo.PackageTest2;

import java.lang.String;

/**
 * Created by Administrator on 14-3-30.
 */
public class Test {

    private int i;

    public static void main(String[] args) {
//        PackageTest p = new PackageTest();
        PackageTest2 p2 = new PackageTest2();

//        FQCN Fully Qualified Class Name 全限定类名
        cn.edu.tsinghua.training.javase.day4.demo.test.Test test = new cn.edu.tsinghua.training.javase.day4.demo.test.Test();

        System.out.println(Math.pow(2, 30));


//        Scanner scanner = new Scanner(System.in);
//        System.out.println("input a number N: ");
//        int n = scanner.nextInt();
//        System.out.println(n);

        String s = "hello";
        System.out.println(s);

        double d = -1.234;
        System.out.println((d > 0)?d:-d);

        Test t = new Test();
        System.out.println(t);
    }

    @Override
    public String toString() {
        return "Test{" +
                "i=" + i +
                '}';
    }
}
