package com.jie.factoryModel;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-23
 * @Time 下午2:32
 */
public class Bicycle implements Cycle {
    @Override
    public void qi() {
        System.out.println("骑bicycle");
    }
}
