package day5.demo;

/**
 * Created by Administrator on 14-4-12.
 */

//class = filed + method
public class ClassTest {

    private A a = new A() {
        @Override
        public void a() {

        }
    };

    private AbstractTest abstractTest = new AbstractTest() {
        @Override
        void test() {

        }
    };


//    static block
    static {

    }


    public void method(int y) {

        int i = 100;
        System.out.println(this.i);//1

        System.out.println(b);
        test(y);
        int x = 1;

        for (int j = 0; j < 10; j++) {
            System.out.println(j);
        }

        for (int j = 0; j < 100; j++) {
            System.out.println(j);
        }
        int j = 10;


//        String x = "";
    }
    private int i = 1;

    public int test(int i) {
        return i;
    }

    private static class T {//Inner Class

    }
    private double d;
    private boolean b;
}
