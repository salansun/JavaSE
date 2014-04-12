package cn.edu.tsinghua.training.javase.day4.demo;

/**
 * Created by Administrator on 14-3-30.
 */
public final class FinalTest {

    public static final int ONE_TWO_THREE = 123;//constant 常量

    private final int i;//终态

    public FinalTest(int i) {
        this.i = i;
//        pi = 3;
    }

    public FinalTest() {
        i = 0;
//        pi = 3;
    }

    public void m() {
//       i = 2;
    }

    public final void method() {
//        ...
        System.out.println("super class method...");
    }

}

class SubFinalTest {

//    @Override
//    public void method() {
//        super.method();//super();
//    }

    public static void main(String[] args) {
        SubFinalTest subFinalTest = new SubFinalTest();
    }
}

//class subString extends String {//Object
//
//}
