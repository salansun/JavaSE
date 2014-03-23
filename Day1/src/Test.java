/**
 * Created by Administrator on 14-3-23.
 */
public class Test {
    public static void main(String[] args) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print((i + 1) * (j + 1) + "\t");
            }
            System.out.println();
        }
    }
}
