package com.jie.factoryModel;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-23
 * @Time 下午2:37
 */
public class Client
{
    public static void main(String[] args) {
        PlayCycle playCycle = new PlayCycle();
        playCycle.playplay(new Cycle1());
    }
}
