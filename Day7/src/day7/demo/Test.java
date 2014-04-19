package day7.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.security.acl.AclNotFoundException;

/**
 * Created by Administrator on 14-4-19.
 */
public class Test {


    public static void main(String[] args) throws AclNotFoundException {//arguments
        int x = 1;
        int y = 0;
//        ...
        String s = "hi";
        s = null;

        String one = "12345b";

        try {
            System.out.println(x / y);
            System.out.println(Integer.parseInt(one));
            System.out.println(s.length());//NullPointerException NPE
            System.out.println("hi".charAt(2));//StringIndexOutBoundsException
            System.out.println(args[2]);//***
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("exception!");
        } finally {
            System.out.println("finally...");
        }

        System.out.println("hi");


        try {
            RandomAccessFile randomAccessFile = new RandomAccessFile("test.txt", "rw");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        try {
            method();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method() throws AclNotFoundException, IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile("data", "r");
    }


}
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 2
//java.lang.StringIndexOutOfBoundsException: String index out of range: 2
