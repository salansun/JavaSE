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

    private int i;
    private double d;
    private boolean b;

    public void method() {

    }

    public int test(int i) {
        return i;
    }

    private static class T {//Inner Class

    }
}
