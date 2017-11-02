package com.jie.thread;

/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-25
 * @Time 上午9:52
 */
public class InnerThread {
    Thread t;
    public InnerThread(){
        t = new Thread("t1"){
            public void run()
            {

            }
        };
    }
}
