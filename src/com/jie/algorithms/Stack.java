package com.jie.algorithms;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-26
 * @Time 下午2:23
 */
public class Stack<T> {
    private int index;
    private Node firstNode;
    private class Node{
        T value;
        Node next;
    }
    public boolean isEmpty()
    {
        return firstNode == null;
    }
    public int size(){
        return index;
    }

    /**
     * firstNode开始肯定是为空,然后用一个新的引用指向firstNode
     * 给firstNode初始化赋值
     * 将初始化后的next指向原来的firstNode
     * @param item
     */
    public void push(T item)
    {
        Node oldFirstNode = firstNode;
        firstNode = new Node();
        firstNode.value = item;
        firstNode.next = oldFirstNode;
        index++;
    }

    /**
     *
     * @return
     */
    public T pop()
    {
        T t = firstNode.value;
        firstNode = firstNode.next;
        index--;
        return t;
    }
}
