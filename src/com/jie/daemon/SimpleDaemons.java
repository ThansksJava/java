package com.jie.daemon;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-25
 * @Time 上午8:57
 */
public class SimpleDaemons implements Runnable{
    @Override
    public void run() {
        while(true)
        {
            try {
                Thread.sleep(20);
                System.out.println(Thread.currentThread()+":"+this);;
            } catch (InterruptedException e) {
                System.out.println("睡死了....");
            }
        }
    }

    public static void main(String[] args) throws InterruptedException {
        for(int i = 0;i < 10;i++)
        {
            Thread daemon = new Thread(new SimpleDaemons());
            daemon.setDaemon(true);
            daemon.start();
        }
        System.out.println("All daemons started");
        Thread.sleep(20);
    }
}
