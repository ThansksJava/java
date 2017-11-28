package com.jie.factoryModel.adapter.ex;

import java.io.*;
import java.util.Properties;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/27
 * @Time 9:20
 */
public class FilePoperties implements FileIo{
    private Properties properties;

    public FilePoperties(String name) {
        properties = new Properties();
        try{
            properties.load(FilePoperties.class.getResourceAsStream(name));
        }catch (IOException exception){

        }
    }
    @Override
    public void saveToFile() throws IOException {
        File file = new File("src/");
        OutputStream out =  new FileOutputStream(file);
        out.write(((String)properties.get("name")).getBytes());
        out.close();
    }
}
