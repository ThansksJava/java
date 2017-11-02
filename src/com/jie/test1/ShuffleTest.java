package com.jie.test1;

import java.util.*;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-11-1
 * @Time 上午9:45
 */
public class ShuffleTest
{
    public static void shuffle(List<Integer> list, Random rnd) {
        int size = list.size();
        Object arr[] = list.toArray();

        // Shuffle array
        for (int i=size; i>1; i--)
            swap(arr, i-1, rnd.nextInt(i));

        // Dump array back into list
        // instead of using a raw type here, it's possible to capture
        // the wildcard but it will require a call to a supplementary
        // private method
        ListIterator it = list.listIterator();
        for (int i=0; i<arr.length; i++) {
            it.next();
            it.set(arr[i]);
        }
    }
    private static void swap(Object[] arr, int i, int j) {
        Object tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp;
    }

    public static void main(String[] args) {
        Integer a[] = new Integer[]{1,2,3,4,5,6};
        List<Integer> aList = Arrays.asList(a);
    }
}
