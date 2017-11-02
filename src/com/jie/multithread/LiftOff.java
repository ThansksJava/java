package com.jie.multithread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-24
 * @Time 上午9:37
 */
public class LiftOff implements Runnable {
    protected int countDown = 10;
    private static int taskCount = 0;
    private final int id = taskCount++;
    public LiftOff() {
    }
    public LiftOff(int countDown) {
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
            Thread.yield();
        }
    }

    public static void main(String[] args) {
/*        for(int i = 0;i <=5;i++){
            Thread t = new Thread(new LiftOff());
            t.start();
            System.out.println("Waiting for Liftoff");
        }*/
        ExecutorService executor = Executors.newCachedThreadPool();
        for(int i=0;i<5;i++){
            executor.execute(new LiftOff());
        }
        executor.shutdown();
    }
}
