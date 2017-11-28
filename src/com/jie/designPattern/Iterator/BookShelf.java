package com.jie.designPattern.Iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/22
 * @Time 7:59
 */
public class BookShelf implements Aggregate{
    private List<Book> books;
    private int length = 0;

    public BookShelf() {
        books = new ArrayList<>();
    }

    public Book getBookAt(int index){
        return this.books.get(index);
    }
    public void appendBook(Book newBook){
        this.books.add(newBook);
        length++;
    }
    public int  getLength(){
        return this.length;
    }

    @Override
    public Iterator iterator() {
        return new BookShelfIterator(this);
    }
}
