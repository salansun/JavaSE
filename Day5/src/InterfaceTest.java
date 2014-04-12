/**
 * Created by Administrator on 14-4-12.
 */
public interface InterfaceTest {
    int ONE = 1;
    void m(int i, double d);
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