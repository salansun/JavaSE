package day8.demo;

import java.io.*;
import java.net.URL;

/**
 * Created by Administrator on 14-4-20.
 */
public class GetFile {
    private static int counter;

    private static void downloadImage(String urlString) throws Exception {
        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();
        FileOutputStream fileOutputStream = new FileOutputStream("c:/images/" + counter + ".jpg");
        int i;
        while ((i = inputStream.read()) != -1) {
            fileOutputStream.write(i);
        }
        fileOutputStream.close();
        counter++;
    }

    private static void downloadHTML(String urlString) throws Exception {
        URL url = new URL(urlString);
        InputStream inputStream = url.openStream();
        FileOutputStream fileOutputStream = new FileOutputStream("c:/1.html");
        int i;
        while ((i = inputStream.read()) != -1) {
            fileOutputStream.write(i);
        }
        fileOutputStream.close();
    }

    public static void main(String[] args) throws IOException {


        try {
            downloadHTML("");
        } catch (Exception e) {
            e.printStackTrace();
        }

        BufferedReader bufferedReader = new BufferedReader(new FileReader("c:/1.html"));
        String s;
        while ((s = bufferedReader.readLine()) != null) {
            if (s.contains("<img data-img=\"1\" data-lazyload=")) {
                try {
                    downloadImage(s.substring(s.indexOf("http://"), s.indexOf("jpg\"") + 3));
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
