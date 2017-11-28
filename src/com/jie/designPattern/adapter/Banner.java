package com.jie.designPattern.adapter;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/24
 * @Time 13:48
 */
public class Banner {
    private String str;

    public Banner(String str) {
        this.str = str;
    }
    public void showWithParen(){
        System.out.println("("+str+")");
    }
    public void showWithAster(){
        System.out.println("***"+str+"***");
    }
}
