package com.jie.designPattern;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-23
 * @Time 下午2:36
 */
public class PlayCycle
{
    public void playplay(CycleFactory cycleFactory){
        cycleFactory.getCycle().qi();
    }
}
