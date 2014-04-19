package day7.demo;

import java.io.IOException;

/**
 * Created by Administrator on 14-4-19.
 */
public class SingletonTest {

    private static SingletonTest singletonTest = new SingletonTest();

    private SingletonTest() {

    }

    public static SingletonTest getSingletonTest() {
        return singletonTest;
    }
}


class Test2 {
    public static void main(String[] args) {

//        SingletonTest singletonTest1 = new SingletonTest();
//        SingletonTest singletonTest2 = new SingletonTest();

        SingletonTest singletonTest = SingletonTest.getSingletonTest();

        Runtime runtime = Runtime.getRuntime();
        try {
            runtime.exec("notepad");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
