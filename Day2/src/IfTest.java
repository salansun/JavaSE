/**
 * Created by Administrator on 14-3-23.
 */
public class IfTest {

    public static void main(String[] args) {

        int grade = 75;

        if (grade >= 85) {
            System.out.println("优秀");
        } else if (grade >= 75) {
            System.out.println("良");
        } else if (grade >= 60) {
            System.out.println("中");
        } else {
            System.out.println("failed...");
        }

//        if (grade >= 60) {
//            System.out.println("passed.");
//        } else {
//            System.out.println("failed.");
//        }


    }
}
