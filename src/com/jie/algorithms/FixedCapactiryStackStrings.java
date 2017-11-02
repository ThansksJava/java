package com.jie.algorithms;
/**
 * Created by IntelliJ IDEA.
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-26
 * @Time 上午9:35
 */
public class FixedCapactiryStackStrings<T> {
    private T [] items;
    private int index = 0;
    public FixedCapactiryStackStrings( int cap) {
        items = (T[])new Object[cap];
    }
    public void push(T item){
        items[index++] = item;
    }
    public T pop()
    {
        return items[--index];
    }
    public boolean isEmpty()
    {
        return index == 0;
    }
    public int size()
    {
        return index;
    }
    public boolean isFull(){
        return index == items.length;
    }
}
