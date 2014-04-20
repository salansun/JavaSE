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

        InputStream inputStream = null;
        try {
//            System.out.println(1/0);
            inputStream = new FileInputStream("Day8/src/day8/demo/InputStreamTest.java");
            System.out.println("available bytes: " + inputStream.available());
            byte[] bytes = new byte[inputStream.available()];
            inputStream.read(bytes);
            System.out.print(new String(bytes));
//            int i;
//            while ((i=inputStream.read()) != -1) {
//                System.out.print((char)i);
//            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inputStream != null) {
                    inputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
//        System.err.print("test...");
    }
}
