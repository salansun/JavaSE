package cn.edu.tsinghua.training.javase.day4.demo;

//import demo.NewTest;

import test.Test;

import java.util.Hashtable;
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
        Hashtable<Integer, Integer> hashtable = new Hashtable<>();
        for (int i = 0; i < 10; i++) {
            hashtable.put((i+1), 0);
        }
        long start = System.currentTimeMillis();//135668998

        for (int i = 0; i < 10000; i++) {
            int r = random.nextInt(10) + 1;
//            System.out.printn(r);
//            int r = (int) (Math.random() * 10) + 1;//static
            hashtable.put(r, hashtable.get(r) + 1);//***
            if (r == 1) {

//                System.out.println(r);//Input/Output
            }
        }

        System.out.println(System.currentTimeMillis() - start);

        for (int i = 0; i < 10; i++) {
            System.out.println((i+1) + "\t:\t" + hashtable.get((i+1)));
        }

        PackageTest packageTest = new PackageTest();

//        NewTest newTest = new NewTest();


//        h<Integer, String>
//        h.put(1, "hi");
//        h.put(1, "hello");
//        h.size()=1
//        h.get(1)=hello

    }
}


