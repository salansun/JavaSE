package day6.demo;

/**
 * Created by Administrator on 14-4-13.
 */
public class StringBuffer_StringTest {

    private static final String STRING = "ABC";

    public static void main(String[] args) {

        StringBuffer s = new StringBuffer();
        for (int i = 0; i < 1000000; i++) {
            s.append(STRING);
        }

        System.out.println(s.length());//?
    }
}
