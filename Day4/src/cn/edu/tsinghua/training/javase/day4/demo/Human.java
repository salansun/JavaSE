package cn.edu.tsinghua.training.javase.day4.demo;

/**
 * Created by Administrator on 14-3-30.
 */
public class Human {
    private String name;
//    private String earth;
    private static String earth;//only one!

    public Human(String name, String earth) {
        this.name = name;
        this.earth = earth;
    }

    public Human() {
    }

    public static void m() {

    }

    public static void main(String[] args) {
        Human zhangsan = new Human("zhangsan", "地球");
        Human.earth = "种了一棵树";
        Human lisi = new Human();

        zhangsan.m();
        lisi.m();

        Human.m();

        System.out.println(Human.earth);
        System.out.println(Human.earth);
    }
}
