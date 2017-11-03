package com.jie.algorithms.sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/2
 * @Time 15:27
 */
public class InsertSort {
    public static int []  sort(int [] a){
        int length = a.length;
        for(int i = 1;i < length;i++){
            int key = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > key){
                a[j+1] = a[j];
                j--;
            }
            a[j+1] = key;
        }
        return a;
    }

    public static void main(String[] args) {
        int [] a = {5,2,4,6,1,3};
        sort(a);
    }
}
