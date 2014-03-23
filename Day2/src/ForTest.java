/**
 * Created by Administrator on 14-3-23.
 */
public class ForTest {
    //    循环变量的初始值
//    循环变量的条件
//    循环变量的变化
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
//                break;//退出离它最近的一个循环
                continue;//退出离它最近的一次循环
            }
            System.out.println(i);
        }

//        int i = 0;
//        while (i > 10) {
//            System.out.println(i);
//            i++;
//        }

//        int i = 0;
//        do {
//            System.out.println(i);
//            i++;
//        } while (i > 10);
    }
}
