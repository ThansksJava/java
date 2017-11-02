package com.jie.algorithms.linkedlist;

/**
 * Created by IntelliJ IDEA.
 * @author fengjie
 * @Description
 * @Date Created in 17-10-26
 * @Time 下午2:20
 */
public class Node<T> {
    T value;
    Node<T> next;

    public Node() {
    }

    public Node(T value, Node<T> next) {
        this.value = value;
        this.next = next;
    }
}
