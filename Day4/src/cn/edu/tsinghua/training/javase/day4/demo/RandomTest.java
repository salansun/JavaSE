package cn.edu.tsinghua.training.javase.day4.demo;

//import demo.NewTest;

import test.Test;

import java.util.Random;

/**
 * Created by Administrator on 14-3-30.
 */

//[1, 100]随机数10000次
//使用Math类的方法实现
//比较Random和Math，效率和分布?(Hashtable)
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        long start = System.currentTimeMillis();//135668998

        for (int i = 0; i < 10000000; i++) {
//            int r = random.nextInt(100) + 1;
//            System.out.println(r);
            int r = (int) (Math.random() * 100) + 1;//static
            if (r == 1) {

//                System.out.println(r);//Input/Output
            }
        }

        System.out.println(System.currentTimeMillis() - start);

        PackageTest packageTest = new PackageTest();

//        NewTest newTest = new NewTest();
    }
}


