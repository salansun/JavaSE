package day5.demo;

/**
 * @author teacher
 * Created by Administrator on 14-4-12.
 * 二维数组。。。
 */
public class _2DArray {

    /**
     * main:
     * @param args
     * @since v1.0
     */
    public static void main(String[] args) {
        int[][] matrix = new int[5][];
        int[] row1 = new int[5];
        matrix[0] = row1;
        int[] row2 = new int[4];
        matrix[1] = row2;
        int[] row3 = new int[2];
        matrix[2] = row3;
        int[] row4 = new int[5];
        matrix[3] = row4;
        int[] row5 = new int[3];
        matrix[4] = row5;
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                matrix[row][col] = row + col;
            }
        }
        System.out.println(matrix[matrix.length - 1][matrix[matrix.length-1].length - 1]);

        String s = "hello";
        System.out.println(s);
    }
}

