package day8.demo;

import java.io.*;
import java.util.Scanner;

/**
 * Created by Administrator on 14-4-20.
 */
public class OutputStreamTest {
    public static void main(String[] args) {
//        read OutputStreamTest.java -> C:/1.java

        try {
            InputStream inputStream = new FileInputStream("day8/src/day8/demo/OutputStreamTest.java");
            OutputStream outputStream = new FileOutputStream("c:/1new.java");
            int i;
            while ((i = inputStream.read()) != -1) {
                outputStream.write(i);
            }
//            outputStream.flush();//字节的输出流没有提供刷新机制
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
