package day6.demo;

import java.util.Iterator;
import java.util.Vector;

/**
 * Created by Administrator on 14-4-13.
 */

//<img width="251" height="167" data-img="1" data-lazyload="http://img11.360buyimg.com/tuangou/g14/M00/1B/1C/rBEhVVNHrjEIAAAAAAC94V0BCUkAALxewHMVaMAAL35407.jpg">
public class VectorTest {
    public static void main(String[] args) {
        Vector<String> strings = new Vector<>();

        strings.add("hello");
        System.out.println(strings.add("hi"));

        strings.set(1, "test");

        System.out.println(strings.get(1));
        System.out.println(strings.set(1, "hi"));//?

        System.out.println(strings.size());

        for (String string : strings) {//增强for循环 iter
            System.out.println(string);
        }

        System.out.println("------------------");

        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();

            System.out.println(next);
        }

//        for (int i = 0; i < strings.size(); i++) {
//            System.out.println(strings.get(i));
//        }
//        Iterator<String> iterator = strings.iterator();
//        while (iterator.hasNext()) {
//            System.out.println(iterator.next());
//        }
    }
}
