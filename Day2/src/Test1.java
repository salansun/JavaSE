/**
 * Created by Administrator on 14-3-23.
 */
//题目：判断[101, 200]有多少个素数，并输出所有素数。（素数：只能被1和它本身整除的正整数，1不是素数）
public class Test1 {
    public static void main(String[] args) {
//        101? 5? 11? 10? 9? x?

        int counter = 0;

        for (int i = 2; i < 10; i++) {
            boolean b = true;
            for (int j = 2; j < i / 2 + 1; j++) {
                if (i % j == 0) {
                    b = false;
                    break;
                }
            }
            if (b) {
                System.out.println(i);
                counter++;
            }
        }

        System.out.println("counter:" + counter);
    }
}
