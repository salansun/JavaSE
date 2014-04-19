package day7.demo;

/**
 * Created by Administrator on 14-4-19.
 */
public class Test {
    public static void main(String[] args) {//arguments
        int x = 1;
        int y = 0;
//        ...
        try {
            System.out.println("hi".charAt(2));//StringIndexOutBoundsException
            System.out.println(x / y);
            System.out.println(args[2]);//***
        } catch (ArrayIndexOutOfBoundsException e) {//
//            ...
            e.printStackTrace();
        } catch (ArithmeticException e) {
//            ...
        } catch (StringIndexOutOfBoundsException e) {
            e.printStackTrace();
        }
        System.out.println("hi");
    }
}
//Exception in thread "main" java.lang.StringIndexOutOfBoundsException: String index out of range: 2
//java.lang.StringIndexOutOfBoundsException: String index out of range: 2
