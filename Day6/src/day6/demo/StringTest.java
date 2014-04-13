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
        int i = Integer.parseInt(n);
        System.out.println(Integer.parseInt(n) + 100);
//        封装类/包裹类
        int j = 1;

        Integer k = new Integer(0);

        System.out.println(Long.MAX_VALUE);
        System.out.println(Integer.decode("100") + 100);

        System.out.println(s.replace('o', 'O'));
        System.out.println(s.replace("hello", "hi"));

        System.out.println(s.toUpperCase());
        System.out.println(s);

        String s2 = "              hello,    world          !     ";
        System.out.println(s2.trim());
        char[] chars = s2.toCharArray();//{' ', ' ',..., 'h', 'e', } ?
        System.out.println(chars.length);

        String[] strings = s2.split("l");
        System.out.println(strings.length);//?
        for (int l = 0; l < strings.length; l++) {
            String string = strings[l];
            System.out.println(string);
        }
    }

    @Override
    public String toString() {
        return "hi";
    }
}
