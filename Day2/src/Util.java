/**
 * Created by Administrator on 14-3-23.
 */
//题目：判断[101, 200]有多少个素数，并输出所有素数。（素数：只能被1和它本身整除的正整数，1不是素数）
public class Util {
    public static boolean isPrime(int n) {
        for (int j = 2; j < n / 2 + 1; j++) {
            if (n % j == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(20));
    }
}
