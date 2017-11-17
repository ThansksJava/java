package com.jie.algorithms.search;

/**
 * Created by IntelliJ IDEA
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/14
 * @Time 15:31
 */
public class SequentialSearchST <Key,Value>{
    private Node first;
    private class Node{
        Key key;
        Value value;
        Node next;
        public Node(Key key,Value value,Node next){
            this.key = key;
            this.value = value;
            this.next = next;
        }
    }
    public Value get(Key key){
        for(Node x = first; x != null;x = x.next){
            if(key.equals(x.key)){
                return x.value;
            }
        }
        return null;
    }

    public void put(Key key,Value value){
        for (Node x = first;x != null;x = x.next){
            if(key.equals(x.key)){
                x.value = value;
                //这一步必须有！！！！
                return;
            }
        }
        //新的node.next连接到原来的first Node
        first = new Node(key,value,first);

    }
}
