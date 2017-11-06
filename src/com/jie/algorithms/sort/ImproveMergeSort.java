package com.jie.algorithms.sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 * @author fengjie
 * @Description 改进后的归并排序
 * @Date Created in 2017/11/3
 * @Time 14:57
 */
public class ImproveMergeSort
{
    private static void merge(int[] index,int [] aux,int lo, int mid, int hi) {
        //2、改进二
        if(index[mid] <= index[mid+1]) {
            return;
        }
        //3、改进三 交换参数避免数组复制??? 还没写呢

        // copy to aux[]
        for (int k = lo;k <= hi; k++) {
            aux[k] = index[k];
        }
        // merge back to a[]
        int i = lo, j = mid+1;
        for (int k = lo; k <= hi; k++) {
            if      (i > mid) {
                index[k] = aux[j++];
            } else if (j > hi) {
                index[k] = aux[i++];
            } else if (aux[j] <= aux[i]) {
                index[k] = aux[j++];
            } else {
                index[k] = aux[i++];
            }
        }
    }
    public static void insert(int[] a,int p,int r)
    {
        for(int i = p;i <= r;i++){
            int key = a[i];
            int j = i-1;
            while(j >= p&& a[j] > key)
            {
                a[j+1] = a[j--];
            }
            a[j+1] = key;
        }
    }
    public static void mergeSort(int [] a,int[] aux,int p,int r){
        //1、改进一
        int insertSortValue = 5;
        if((r-p+1) <= insertSortValue){
            insert(a,p,r);
        }
        if(p < r){
            int q = (p+r)/2;
            mergeSort(a,aux,p,q);
            mergeSort(a,aux,q+1,r);
            merge(a,aux,p,q,r);
        }
    }
    public static void mergeSort(int [] a){
        int [] aux = new int[a.length];
        mergeSort(a,aux,0,a.length-1);

    }
    public static boolean isSorted(int[] index, int mid)
    {
        return index[mid] < index[mid+1];
    }
    public static void main(String[] args) {
        int [] a = new int[]{5,7,8,1,2,7,45,67,3,
                25,134,4,2,3,45,1,6,34,234,234,24,
                221,2,2,5,25,7,28,4,45,23,6,427,52,
                6,52,7,236,23,4,3265,4,3,546,123,34,87,45,636,3,23421,4325};
        System.out.println("排序前："+Arrays.toString(a));
        mergeSort(a);
        System.out.println("排序后："+Arrays.toString(a));
    }
}
