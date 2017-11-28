package com.jie.designPattern;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-23
 * @Time 下午2:34
 */
public class Cycle1 implements CycleFactory {
    @Override
    public Cycle getCycle() {
        return new Unicycle();
    }
}
