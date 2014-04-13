package day6.demo;

import java.util.Hashtable;

/**
 * Created by Administrator on 14-4-13.
 */
public class HashtableTest {
    public static void main(String[] args) {
//
////        K-key键; V-value值
//        Hashtable<Integer, String> hashtable = new Hashtable<>();
//
//        hashtable.put(1, "hi");
//        hashtable.put(-100, "hello");
//
//        System.out.println(hashtable.get(-100));
//
//        System.out.println(hashtable.size());

        String[] strings = {"a", "b", "c"};

        Hashtable<String, Integer> hashtable = new Hashtable<>();

        for (int i = 0; i < strings.length; i++) {
            hashtable.put(strings[i], i);
        }

        int i = 1;
        System.out.println(i + ": " + strings[i]);//b

        System.out.println(strings[i] + " index: " + hashtable.get(strings[i]));//1
    }
}
