package com.jie.algorithms.sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 * @author fengjie
 * @Description 快排
 * @Date Created in 2017/11/6
 * @Time 15:59
 */
public class QuickSort {
    public static void sort(int []a)
    {
        int p = 0;
        int r = a.length-1;
        int x = a[r];
        int i = p-1;
        for(int j = p;j <= r-1;j++){
            if(a[j] <= x){
                i++;
                exchange(a,i,j);
            }
        }
        exchange(a,i+1,r);
    }
    public static void exchange(int[] a,int i,int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
    public static void main(String[] args) {
        int [] a = {1,4,2,9,3,7,4,8,5};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
