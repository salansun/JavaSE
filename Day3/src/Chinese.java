/**
 * Created by Administrator on 14-3-29.
 */
public class Chinese extends Human {

    String shengxiao;

//        子类继承父类，子类的构造方法会默认调用父类的无参构造方法
    Chinese(String name, int age, double weight, double height, char sex, String shengxiao) {
        super(name, age, weight, height, sex);//this指代当前类，super指代父类
//        super();
        this.shengxiao = shengxiao;
    }

//    覆盖overrides/重写overwrite
    void work() {
        System.out.println(name + " 在工作。。。");
    }

}
