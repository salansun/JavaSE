/**
 * Created by Administrator on 14-3-23.
 */
public class SwitchTest {

//    project structure: Shift+Alt+Ctrl+S
    public static void main(String[] args) {

        char c = 'A';

        double d = 1.2;

        String s = "test";

        int grade = 86;



        switch (grade/10) {
            case 10:
            case 9:
                System.out.println("优秀");
                break;
//            case 'B':
//                System.out.println("lianghao");
//                break;
//            case 'C':
//                System.out.println("zhong");
//                break;
//            case 'D':
//                System.out.println("failed");
//                break;
            default:
                System.out.println("others...");
//                break;
        }
    }
}
