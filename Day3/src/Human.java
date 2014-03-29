//类 = 域 + 方法
//class = field(s) + method(s)
public class Human {

//Alt+Insert

//    constructor
    public Human(String name, int age, double weight, double height, char sex) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
        this.sex = sex;
    }

    public Human() {
        this.name = "lisi";
    }

    //    域
    String name;
    int age;
    double weight;
    double height;
    char sex;//m, f

    T t;



    //    方法
    void study(int i, double d, String s) {
//        return;
    }

    void work() {
        System.out.println(name + " is working...");
    }

    String exam(int grade) {
        int i = 10;

        T t = new T();

        if (grade >= 60) {
            return "passed";

        } else {
            return "failed";
        }

    }
}

class T {
    int i;
}
