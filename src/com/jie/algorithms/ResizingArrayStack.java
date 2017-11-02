package com.jie.algorithms;

import java.util.Iterator;

/**
 * Created by IntelliJ IDEA.
 * @author fengjie
 * @Description 自定义栈,设定栈的大小始终为实际拥有元素数量的两倍
 * @Date Created in 17-10-26
 * @Time 上午10:04
 */
public class ResizingArrayStack<T> implements Iterable {
    T [] items = (T [])new Object[1];//存放元素的栈
    int index;//现在栈的大小,也是往里面存放数据时候的索引
    //根据传入的大小重新定义栈
    public void resize(int extendSize)
    {
        T[] extendItems = (T[]) new Object[extendSize];
        //将原来栈的元素复制到新的栈中
        for(int i=0;i<items.length;i++)
        {
            extendItems[i] = items[i];
        }
        //然后将原栈的引用指向扩展栈
        items = extendItems;
    }
    //入栈
    public void push(T item)
    {
        //在入栈之前判断是否已经要超出栈的预定义大小超出的话先扩展栈的大小
        if(index == items.length){
            //定义一个扩展栈,大小是现在的栈的两倍容量
            this.resize(items.length * 2);
        }
        items[index++] = item;
    }
    //取出栈顶元素
    public T pop()
    {
        //先将栈顶元素拿到,同时栈顶元素位置置空
        T popItem = items[--index];
        //执行完上一条之后index已经是栈顶元素的位置了
        items[index] = null;
/*        if (index * 2 < items.length)
        {
            this.resize(index*2);
        }*/
        //当前元素的数目是否小于栈的大小的1/4,这样重定义栈的大小后栈的状态为半满还能继续往里面放
        if (index > 0 && index == items.length/4)
        {
            this.resize(items.length / 2);
        }
        return popItem;
    }
    public boolean isEmpty()
    {
        return index == 0;
    }
    public int size()
    {
        return index;
    }
    public Iterator<T> iterator()
    {
        return  new ReverseArrayIterator();
    }
    private class ReverseArrayIterator implements Iterator<T>
    {
        private int i = index;

        @Override
        public void remove() {

        }
        @Override
        public boolean hasNext() {
            return i > 0;
        }
        @Override
        public T next() {
            return items[--i];
        }
    }
}
