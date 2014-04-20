package day8.demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Administrator on 14-4-20.
 * 输入流输出流
 */
public class InputStreamTest {
    public static void main(String[] args) {

        try {
            InputStream inputStream = new FileInputStream("Day8/src/day8/demo/InputStreamTest.java");
            int i;
            while ((i=inputStream.read()) != -1) {
                System.out.print((char)i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
