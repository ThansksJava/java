package com.jie.multithread;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-25
 * @Time 上午10:48
 */
public class SleeperThread extends Thread {
    private int duration;
    public SleeperThread(String name,int duration) {
        setName(name);
        this.duration = duration;
        start();
    }
    @Override
    public void run() {
        try {
            sleep(1500);
        } catch (InterruptedException e) {
            System.out.println(getName() + "已经被打断,状态:"+isInterrupted());
        }
        System.out.println(getName()+"已经被唤醒");
    }
}
