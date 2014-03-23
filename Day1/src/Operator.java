/**
 * Created by Administrator on 14-3-22.
 */
public class Operator {//Egyptian Brackets
    public static void main(String[] args) {
        int x = 10;
        int y = 3;

        int studentNumber = 1;//匈牙利命名法/驼峰命名法

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);//整数除法：截去余数
        System.out.println("--------------");
        System.out.println(--x);//自增/自减
        System.out.println(x);
        System.out.println(x);
        System.out.println("--------------");
        System.out.println(x % y);//模运算 求余

        System.out.println(-7 % -5);

        System.out.println("==============");
        System.out.println(1 == 2);
        boolean b = (1 != 200 - 1);
        System.out.println(b);

        String s1 = "hi";
        String s2 = new String("hi");
        char c1 = 'a';//97
        char c2 = 'A';//65

        System.out.println(s1 + s2);//字符串拼接
        System.out.println(s2);
        System.out.println(s1 == s2);//？

        System.out.println("==============");


        boolean b1 = true;
        boolean b2 = true;
        boolean b3 = false;
        boolean b4 = false;

//        &
        System.out.println(b1 & b2);//T
        System.out.println(b3 & b4);
        System.out.println(b1 & b3);
        System.out.println(b3 & b1);

//        |
        System.out.println(b1 | b2);
        System.out.println(b3 | b4);//F
        System.out.println(b1 | b3);
        System.out.println(b3 | b1);

        System.out.println("-----------");
//        ^ 异或
        System.out.println(b1 ^ b2);//F
        System.out.println(b3 ^ b4);//F
        System.out.println(b1 ^ b3);//T
        System.out.println(b3 ^ b1);//T

//        !
        System.out.println(!b1);//F
        System.out.println(!b3);//T

        System.out.println("-----------");

//        &&
        System.out.println(b1 && b2);//T
        System.out.println(b3 && b4);
        System.out.println(b1 && b3);
        System.out.println(b3 && b1);

//        ||
        System.out.println(b1 || b2);
        System.out.println(b3 || b4);//F
        System.out.println(b1 || b3);
        System.out.println(b3 || b1);

        System.out.println("============");
        int m = 1;
        int n = 0;

        System.out.println((m == 0) && (n++ == 0));//位运算符
        System.out.println(n);

        System.out.println(m & n);


        int i = 100;
        int j = 1;

//        i = i + j;
        i %= j;
        System.out.println(i);

        int k = (i > j) ? i : j;

        System.out.println(k);


        char c = 'A';//65

        int t = c;//t=c?

        int t1 = 600000;
        char d = (char) t1;//c1=t1?

//        [0, 65535]
//        [-2^31, 2^31-1]

        char d1 = 100;

        System.out.println(d);

        int result = 1 + 2 - (3 * 4 / 5 % 6);
        System.out.println(result);


    }
}
