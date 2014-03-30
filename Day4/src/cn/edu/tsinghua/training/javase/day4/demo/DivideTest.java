package cn.edu.tsinghua.training.javase.day4.demo;

/**
 * Created by Administrator on 14-3-30.
 */
public class DivideTest {

    private int x;
    private int y;

    public DivideTest(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void divide() {
        m();
        System.out.println(x + " / " + y + " = " + x / y);
    }

    public void setX(int x) {//设置/集合
        this.x = x;
    }

    public void setY(int y) {
        if (y != 0) {
            this.y = y;
        } else {
            System.out.println("y can not be zero!");
            System.exit(0);
        }
    }

    private void m() {
        //仅仅被divide方法调用
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }
}
