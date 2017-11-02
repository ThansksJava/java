package com.jie.algorithms.linkedlist;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-10-30
 * @Time 上午9:48
 */
public class RemoveItem
{
    public static boolean remove(Node<String> node,String s)
    {
        if(node.next == null) return true;
        if(node.next.value.equals(s)){
            Node n = node.next;
            node.next = node.next.next;
            n.next = null;
        }
        else{
            remove(node.next,s);
        }
        return false;
    }

    public static void main(String[] args) {
        Node n4 = new Node("jk",null);
        Node n3 = new Node("jack",n4);
        Node n2 = new Node("ck",n3);
        Node n1 = new Node("jack",n2);
        System.out.println(remove(n1,"jack"));
    }
}
