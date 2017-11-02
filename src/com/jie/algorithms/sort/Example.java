package com.jie.algorithms.sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 17-11-1
 * @Time 下午2:46
 */
public class Example
{
/*    public static void sort(Comparable [] a){
         int N = a.length;
         for(int i = 0;i < N;i++)
         {
             int min = i;
             for(int j = i+1; j < N;j++){
                 if(!less(a[j],a[min])) min = j;
             }
             exch(a,i,min);
         }
    }*/
    public static void sort(Comparable [] a)
    {
        int N = a.length;
        for(int i = 0;i < N;i++){
            for(int j = i+1;j < N;j++){
                if(less(a[i],a[j])) exch(a,i,j);
            }
        }
    }
    private static boolean less(Comparable v,Comparable w){
        return v.compareTo(w) > 0;
    }
    private static void exch(Comparable [] a,int i,int j){
        Comparable t = a[i];
        a[i] = a[j];
        a[j] = t;
    }
    private static void show(Comparable[] a)
    {
        int length = a.length;
        for(int i= 0;i < length;i++){
            System.out.println(a[i]+"  ");
        }
    }
    public static boolean isSorted(Comparable [] a){
        int length = a.length;
        for(int i = 1;i < length;i++){
            if(less(a[i],a[i-1])) return false;
        }
        return  true;
    }

    public static void main(String[] args) {
        String [] a = new String[]{"1","2","7","5","6"};
        sort(a);
        System.out.println(Arrays.toString(a));
    }
}
