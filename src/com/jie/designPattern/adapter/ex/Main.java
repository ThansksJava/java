package com.jie.designPattern.adapter.ex;
import java.io.InputStream;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/27
 * @Time 9:13
 */
public class Main {
    public static void main(String[] args) throws Exception{
        Properties properties = new Properties();
        InputStream in = Main.class.getResourceAsStream("/test.txt");
        properties.load(in);
        System.out.println(properties.get("name"));
//        properties.load(new FileInputStream("src/com/jie/designPattern/adapter/ex/test.txt"));
//        System.out.println(properties.get("name"));
//        File file = new File(".");
//        System.out.println(file.getAbsolutePath()+file.getAbsoluteFile().getParent());
//        InputStream in = new FileInputStream(new File(".").getAbsoluteFile().getParent());
    }
}
