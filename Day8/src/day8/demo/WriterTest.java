package day8.demo;

import java.io.*;

/**
 * Created by Administrator on 14-4-20.
 * 中文
 */
public class WriterTest {
    public static void main(String[] args) {
        //        read WriterTest.java -> C:/2.java
        try {
            Reader reader = new FileReader("day8/src/day8/demo/WriterTest.java");
            Writer writer = new FileWriter("c:/2.java");
            int i;
            while ((i = reader.read()) != -1) {
                writer.write(i);
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
//        Closeable

        System.out.println("hello");

//        RandomAccessFile
//        DataInputStream
//        DataOutputStream
//        Ctrl+Alt+U
    }
}
