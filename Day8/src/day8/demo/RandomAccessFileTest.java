package day8.demo;

import java.io.IOException;
import java.io.RandomAccessFile;

/**
 * Created by Administrator on 14-4-20.
 */
public class RandomAccessFileTest {
    public static void main(String[] args) {

        RandomAccessFile randomAccessFile = null;
        try {
            randomAccessFile = new RandomAccessFile("c:/raf", "wr");//read write
            for (int i = 0; i < 10; i++) {
                randomAccessFile.writeDouble(0.5 * i);
            }
            randomAccessFile.seek(4);
            randomAccessFile.writeDouble(10);
            randomAccessFile.seek(0);
//            randomAccessFile.seek(16);
//            randomAccessFile.writeDouble(0);
            System.out.println(randomAccessFile.readDouble());
            for (int i = 0; i < 10; i++) {
                System.out.println(randomAccessFile.readDouble());
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (randomAccessFile != null) {
                try {
                    randomAccessFile.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        System.out.println("test");
//        URL
    }
}
