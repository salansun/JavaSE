package day8.demo;

//Alt+Ctrl+O (Optimize import)

import day8.demo.test.Test;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;



/**
 * Created by Administrator on 14-4-20.
 */
public class ReaderTest {
    public static void main(String[] args) {

//        int i = new Scanner(System.in).nextInt();
//        System.out.println(i);

        Test test = new Test();

        try {
            Reader reader = new FileReader("c:/data");
            int i;
            while ((i = reader.read()) != -1) {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//输入输出:参照物->程序