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
    public Key min()
    {
        return min(root).key;
    }
    public Node min(Node node){
        if (node.left == null) return node;
        return min(node.left);
    }
    public Key floor(Key key) {
        Node x = floor(root, key);
        if (x == null) return null;
        return x.key;
    }

    public Node floor(Node x,Key key){
        if(x == null) return null;
        int cmp = key.compareTo(x.key);
        if(cmp == 0){
            return x;
        }
        if(cmp < 0) return floor(x.left,key);
        //下面是cmp >0 的实现，如果传入的key大于二叉树的跟的话，那么小于等于
        // key的最大值只可能出现在右子树中
        Node t =floor(x.right,key);
        if(t != null) return t;
        else return x;
    }
    public Key select(int k){
        return select(root,k).key;
    }
    public Node select(Node x,int k){
        if(x == null){
            return null;
        }
        int t = size(x.left);
        if( t > k) return select(x.left,k);
        else if(t < k) return select(x.right,t-k-1);
        else return x;
    }
    public int rank(Key key){
        return rank(root,key);
    }
    public int rank(Node x,Key key){
        if(x == null) return 0;
        int cmp = key.compareTo(x.key);
        if(cmp < 0){
            return rank(x.left,key);
        }else if(cmp > 0){
            return size(x.left)+1+rank(x.right,key);
        }
        else{
            return size(x.left);
        }
    }
    public void deleteMin(){
        root = deleteMin(root);
    }
    private Node deleteMin(Node x){
        if(x.left == null) {
            return x.right;
        }
        //上一层的x的left等于下一层的x的
        x.left = deleteMin(x.left);
        x.n = size(x.left)+size(x.right)+1;
        return x;
    }
    public void delete(Key key){
        root = delete(root,key);
    }
    private Node delete(Node node,Key key){
        if(node == null) return null;
        int cmp = key.compareTo(node.key);
        if(cmp < 0){
            node.left = delete(node.left,key);
        }else if(cmp > 0){
            node.right = delete(node.right,key);
        }else{
            if(node.right == null) return node.left;
            if(node.left== null) return node.right;
            Node t = node;
            node = min(t.right);
            node.right = deleteMin(t.right);
            node.left = t.left;
        }
        node.n = size(node.left) + size(node.right) + 1;
        return node;
    }

}
