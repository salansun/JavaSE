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
//            InputStream inputStream = new FileInputStream("day8/src/day8/demo/OutputStreamTest.java");
            OutputStream outputStream = new FileOutputStream("c:/1.java");
//            int i;
//            while ((i = inputStream.read()) != -1) {
////                System.out.print((char)i);
//                outputStream.write(i);
//            }
            String s = new Scanner(System.in).nextLine();
            outputStream.write(s.getBytes());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
