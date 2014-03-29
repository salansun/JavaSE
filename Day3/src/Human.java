//类 = 域 + 方法
//class = field(s) + method(s)
public class Human {

    Human(String s, int i, double d1, double d2, char c) {
        name = s;
        age = i;
        weight = d1;
        height = d2;
        sex = c;
    }

    //    域
    String name;
    int age;
    double weight;
    double height;
    char sex;//m, f


    //    方法
    void study(int i, double d, String s) {
//        return;
    }

    void work() {

    }

    String exam(int i) {
        i = 1;
        return "passed";

    }
}
