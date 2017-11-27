package com.jie.factoryModel.adapter;

/**
 * Created by IntelliJ IDEA
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/24
 * @Time 13:58
 */
public class Main {
    public static void main(String[] args) {
        PrintBanner printBanner = new PrintBanner("hello");
        printBanner.printWeak();
        printBanner.printStrong();
    }
}
