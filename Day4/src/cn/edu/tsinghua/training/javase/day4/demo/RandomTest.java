package cn.edu.tsinghua.training.javase.day4.demo;

//import demo.NewTest;
import test.Test;

import java.util.Random;

/**
 * Created by Administrator on 14-3-30.
 */

//[1, 100]随机数10000次
//使用Math类的方法实现
public class RandomTest {
    public static void main(String[] args) {
        Random random = new Random();
        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(100) + 1;
            System.out.println(r);
        }

        PackageTest packageTest = new PackageTest();

//        NewTest newTest = new NewTest();
    }
}


