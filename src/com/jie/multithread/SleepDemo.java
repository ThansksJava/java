package com.jie.multithread;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-24
 * @Time 上午10:45
 */
public class SleepDemo implements Runnable{
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public SleepDemo() {
    }
    public SleepDemo(int countDown) {
        this.countDown = countDown;
    }
    public String status()
    {
        return "#"+id+"("+(countDown >0 ?countDown:"LiftOff!") + "),";
    }
    @Override
    public void run() {
        while(countDown-- > 0){
            System.out.println(status());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            executor.execute(new LiftOff());
        }
        executor.shutdown();
        Math.random();
    }
}
