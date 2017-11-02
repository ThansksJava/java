package com.jie.multithread;

import jdk.nashorn.internal.runtime.regexp.JoniRegExp;

import java.util.concurrent.TimeUnit;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-25
 * @Time 上午10:30
 */
public class JoinThread extends Thread {
    private SleeperThread sleeperThread;
    public JoinThread(String name,SleeperThread sleeperThread){
        this.setName(name);
        this.sleeperThread = sleeperThread;
        start();
    }

    @Override
    public void run() {

        try {
            sleeperThread.join();
        } catch (InterruptedException e) {
            System.out.println("中断");
        }
        System.out.println(getName()+" join completed");
    }

    public static void main(String[] args) {
        SleeperThread sleepy = new SleeperThread("sleepy",1500);
        SleeperThread  grumpy = new SleeperThread("grumpy",1500);
        JoinThread dopey = new JoinThread("dopey",sleepy);
        JoinThread doc = new JoinThread("doc",grumpy);
        grumpy.interrupt();
    }
}
