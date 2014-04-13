package day6.demo;

/**
 * Created by Administrator on 14-4-13.
 */
public class StringBufferTest {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("hello");
        System.out.println(stringBuffer.length());
        System.out.println(stringBuffer.capacity());

        String s = "hello";
        System.out.println(s.length());

        StringBuffer stringBuffer1 = new StringBuffer(s);//1

        String s1 = new String(stringBuffer1);//2

        String s2 = stringBuffer1.toString();//3


        System.out.println(stringBuffer1);//隐式调用toString()

        stringBuffer1.setLength(30);
        System.out.println(stringBuffer1.length());
        System.out.println(s1 + stringBuffer);

        System.out.println(stringBuffer.insert(1, "hi"));
    }
}
