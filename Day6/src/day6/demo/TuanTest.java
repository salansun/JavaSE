package day6.demo;

/**
 * Created by Administrator on 14-4-13.
 */
public class TuanTest {

    private static final String LINK = "<img width=\"251\" height=\"167\" data-img=\"1\" data-lazyload=\"http://img11.360buyimg.com/tuangou/g14/M00/1B/1C/rBEhVVNHrjEIAAAAAAC94V0BCUkAALxewHMVaMAAL35407.jpg\">";

    private static final String LINK2 = "<img width=\"251\" height=\"167\" data-img=\"1\" data-lazyload=\"http://img14.360buyimg.com/tuangou/g15/M01/12/0B/rBEhWlM6lMIIAasdfasdfAAAAABUwVyjhRcAALCqgMZQYEAAFTZ052.jpg\">";

    public static void main(String[] args) {

        System.out.println(LINK2.substring(LINK2.indexOf("http"), LINK2.indexOf("\">")));
    }
}
