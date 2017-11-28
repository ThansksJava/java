package com.jie.designPattern.Iterator;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/22
 * @Time 8:15
 */
public class Main {
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        bookShelf.appendBook(new Book("神墓"));
        bookShelf.appendBook(new Book("不死不灭"));
        bookShelf.appendBook(new Book("长生界"));
        Iterator iterator = bookShelf.iterator();
        while(iterator.hasNext()){
            System.out.println(((Book)iterator.next()).getName());
        }
    }
}
