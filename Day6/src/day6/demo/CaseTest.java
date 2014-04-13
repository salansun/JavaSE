package day6.demo;

/**
 * Created by Administrator on 14-4-13.
 */
public class CaseTest {
    public static void main(String[] args) {
        String s = "hi!";
        s = "hello";
        System.out.println(toUpperCase(s));
    }

    public static String toUpperCase(String s) {

        char[] chars = s.toCharArray();

        for (int i = 0; i < chars.length; i++) {
            if (chars[i]>='a' && chars[i]<='z') {
                chars[i] -= 32;
            }
        }

        return new String(chars);
    }
}
