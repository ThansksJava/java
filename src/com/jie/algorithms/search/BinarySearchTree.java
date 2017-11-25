package com.jie.algorithms.search;
/**
 * Created by IntelliJ IDEA
 * @author  fengjie
 * @Description
 * @Date Created in 2017/11/15
 * @Time 10:01
 */
public class BinarySearchTree<Key extends Comparable<Key>,Value> {
    private Node root;
    private class Node{
        private Key key;
        private Value value;
        private Node left,right;
        private int n;
        public Node(Key key,Value value,int n){
            this.key = key;
            this.value = value;
            this.n = n;
        }
    }
    public int size(){
        return this.size(root);
    }
    public int size(Node x){
        if(x == null){
            return 0;
        }
        else{
            return x.n;
        }
    }
    public Value get(Key key){
        return this.get(root,key);
    }
    public Value get(Node node,Key key){
        if(node == null){
            return null;
        }
        int cmp = key.compareTo(node.key);
        if(cmp < 0) return get(node.left,key);
        if(cmp == 0) return node.value;
        if(cmp > 0) return get(node.right,key);
        return null;

    }
    public void put(Key key,Value value){
        root = put(root,key,value);
    }
    public Node put(Node node,Key key,Value value){
        if(node == null) return new Node(key,value,1);
        int cmp = key.compareTo(node.key);
        if(cmp < 0) {
            node.left = put(node.left,key,value);
        }
        else if(cmp > 0){
            node.right = put(node.right,key,value);
        }
        else
        {
            node.value = value;
            node.n = size(node.left)+size(node.right)+1;
        }
        return node;
    }

}
