/**
 * Created by Administrator on 14-3-22.
 */
public class Variable {//Unicode
    public static void main(String[] args) {
        System.out.println("狗。。。");
        test();
    }

    public static void test() {

        boolean b = true;//false

        char c = 65535;//'\n';//'\u9fbb';//65;//'\u0061';//character-char 'b'
        short s = 1;
        int i = 2147483647;//2^31-1 INTEGER-int
        long l = 2147483648L;
        byte b1 = -128;//bit位 byte字节

        float f = 1.234f;
        double d = 2;

        b = false;

        double v = 74.5E8;

        System.out.println(b1);

        String s1 = "hello...";//字符串

        System.out.println(s1);

        System.out.println(Long.MIN_VALUE);

        System.out.println(v);

        System.out.println(c);

        System.out.println("HI...");
    }
}
