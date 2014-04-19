package day7.demo;

import java.util.Scanner;

/**
 * Created by Administrator on 14-4-19.
 */
//题目6：输入一行字符，分别统计出其中英文字母、空格、数字和其它字符的个数。
public class E6 {

    private static int a, b, c, d;

    public static void main(String[] args) {
        System.out.println("input a string: ");
        String s = new Scanner(System.in).nextLine();

        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char aChar = chars[i];
            if ((aChar >= 'A' && aChar <= 'Z') || (aChar >= 'a' && aChar <= 'z') || (aChar >= '\u4e00' && aChar <= '\u9fbb')) {
                a ++;
            } else if (aChar == ' ') {
                b ++;
            } else if (aChar >= '0' && aChar <= '9') {
                c ++;
            } else {
                d ++;
            }
        }

        System.out.println(a + "\n" + b + "\n"  + c + "\n"  +d);
    }
}
