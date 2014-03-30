package cn.edu.tsinghua.training;

/**
 * Created by Administrator on 14-3-30.
 */
public class EncapsulationTest {

    public int i;
    private double d;
    protected boolean b;
    String s;

    public void a() {

    }

    private void b() {

    }

    protected void c() {

    }

    void d() {

    }

    public static void main(String[] args) {
        EncapsulationTest encapsulationTest = new EncapsulationTest();
        System.out.println(encapsulationTest.d);
        encapsulationTest.b();
    }
}
