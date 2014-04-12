/**
 * Created by Administrator on 14-4-12.
 */

package day5.demo;

//对其实现类做了规范和约束
public interface InterfaceTest {
    int ONE = 1;
    void m(int i, double d);//
}

//对其子类做了规范和约束
abstract class AbstractTest {

    abstract void test();//

    public void t() {

    }

}


class SubClass implements InterfaceTest {

    @Override
    public void m(int i, double d) {
//        InterfaceTest interfaceTest = new InterfaceTest();
        SubClass subClass = new SubClass();
        InterfaceTest interfaceTest = new SubClass();//***
        System.out.println(ONE);
    }
}