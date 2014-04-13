package day6.demo;

import java.util.Objects;

/**
 * Created by Administrator on 14-4-13.
 */
public class StringTest extends Object {

    private int i;

    public static void main(String[] args) {

        String s = "hello, world!";
        String s1 = new String("丁");

        System.out.println(s == s1);

        int[] ints = new int[10];
        Object[] objects = new Object[100];

        objects[0] = 1;
        objects[1] = "hello";

        System.out.println(s.equalsIgnoreCase(s1));

        StringTest stringTest = new StringTest();
        System.out.println(stringTest);//
        System.out.println(s);
        System.out.println(s.equals(stringTest.toString()));//day6.demo.StringTest@


        System.out.println(s.compareTo(s1));//65-97 ? 97-65

        System.out.println(s.lastIndexOf("l"));

        System.out.println(s.substring(4));

        System.out.println(s+s1);

//        boolean b = String.valueOf(false);
        System.out.println(String.valueOf(true));
        System.out.println(String.valueOf(100)+100);
        String n = "100";//100?
    }

    @Override
    public String toString() {
        return "hi";
    }
}
