package day5.demo;

/**
 * Created by Administrator on 14-4-12.
 * 参数传递方式
 * 值传递：基本数据类型
 * 引用传递：引用数据类型（特例：String/?）
 */
public class PrimitiveTest {

    public static void method(int a) {
        System.out.println("2: " + a);//0
        a++;
        System.out.println("3: " + a);//1
    }

    public static void main(String[] args) {
        int i = 0;
        System.out.println("1: " + i);//0
        method(i);
        System.out.println("4: " + i);//0
    }
}

class ReferenceTest {

    private int i;

    public static void method(ReferenceTest referenceTest2) {
        System.out.println("2: " + referenceTest2.i);//0
        referenceTest2.i ++;
        System.out.println("3: " + referenceTest2.i);//1
    }

    public static void main(String[] args) {
        ReferenceTest referenceTest = new ReferenceTest();
        System.out.println("1: " + referenceTest.i);//0
        method(referenceTest);
        System.out.println("4: " + referenceTest.i);//1

    }
}

