package com.jie.designPattern.singleton;

/**
 * Created by IntelliJ IDEA.
 * @Author fengjie
 * @Description 饿汉式，线程安全，基于ClassLoader机制避免多线程的同步问题
 * @Date Created in 2017/11/29
 * @Time 10:12
 */
public class Singleton {
    private static Singleton singleton = new Singleton();
    private Singleton(){

    }
    public static Singleton getInstanced(){
        return singleton;
    }
}
