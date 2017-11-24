package com.jie.factoryModel.adapter;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/24
 * @Time 13:51
 */
public class PrintBanner implements Print {
    Banner banner;

    public PrintBanner(String string) {
        this.banner = new Banner(string);
    }

    @Override
    public void printWeak() {
        System.out.println("调整一下");
        banner.showWithParen();
        System.out.println("调整完了");
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
