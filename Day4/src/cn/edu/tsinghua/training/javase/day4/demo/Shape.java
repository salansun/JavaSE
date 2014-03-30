package cn.edu.tsinghua.training.javase.day4.demo;

/**
 * Created by Administrator on 14-3-30.
 */

//抽象：抽取“像”的部分
//对其所有的子类做了一个规范和约束
public abstract class Shape {
    private int i;
    public abstract double draw(int i, String s);
    public abstract void m();
}

class SomeShape extends Shape {

    @Override//annotation 注解
    public double draw(int i, String s) {
//        ...
        return 1;
    }

    @Override
    public void m() {

    }
}

class Test {
    public static void main(String[] args) {

        Circle circle = new Circle();
//        Shape shape = new Shape();

        SomeShape someShape = new SomeShape();

        Shape shape = new SomeShape();//new Circle();
//        shape.draw();
        shape.m();
    }
}

class Circle {

    public void draw() {
//        draw a circle...
    }

    public void m() {

    }
}

class Square {
    public void draw() {

    }
}

class Rectangle {
    public void draw() {

    }
}

class Triangle {
    public void draw() {

    }
}
