package com.jie.algorithms.sort;


import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 * @author fengjie
 * @Description 归并排序
 * @Date Created in 2017/11/3
 * @Time 9:10
 */
public class MergeSort
{
    /**
     * 原始版本，自己提供一个分好的数组
     * @param a
     * @param p
     * @param q
     * @param r
     */
    public static void merge(int [] a,int p, int q,int r){
        //计算每个分数组的大小，除了哨兵之外
        int n1 = q-p+1;
        int n2 = r-q;
        //初始化数组的大小多加一用于存放哨兵用
        int[] L = new int[n1+1];
        int[] R = new int[n2+1];
        for(int i = 0;i < n1;i++){
            L[i] = a[p+i];
        }
        for (int i = 0;i < n2;i++){
            R[i] = a[q+i+1];
        }
        L[n1] = 999;
        R[n2] = 999;
        int i = 0;
        int j = 0;
        for(int k = p;k <= r;k++)
        {
            if(L[i] <= R[j]){
                a[k] = L[i];
                i++;
            }
            else{
                a[k] = R[j];
                j++;
            }
        }
    }

    /**
     * 递归自己分组
     * @param a
     * @param p
     * @param r
     */
    public static void mergeSort(int [] a,int p,int r){
        if(p < r){
            int q = (p+r)/2;
            mergeSort(a,p,q);
            mergeSort(a,q+1,r);
            merge(a,p,q,r);
        }
    }
    public static void main(String[] args) {
        int a[] = {67,24,1,3,5,7,2,4,6,8};
        mergeSort(a,2,9);
    }
}
