package day8.demo.test;

import java.io.*;

/**
 * Created by Administrator on 14-4-20.
 */
public class BufferTest {

    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("D:\\1_HTML-CSS\\software\\idea.rar");
            FileOutputStream fileOutputStream = new FileOutputStream("d:/test.rar");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            int i;
            while ((i = bufferedInputStream.read()) != -1) {
                bufferedOutputStream.write(i);
            }
            bufferedInputStream.close();
            bufferedOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
