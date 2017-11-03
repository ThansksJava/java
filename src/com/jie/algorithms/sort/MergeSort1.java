package com.jie.algorithms.sort;

import java.util.Arrays;

/**
 * Created by IntelliJ IDEA
 *
 * @author fengjie
 * @Description
 * @Date Created in 2017/11/3
 * @Time 14:57
 */
public class MergeSort1
{
    private static void merge(int[] index, int lo, int mid, int hi) {

        // copy to aux[]
        int[] aux = new int[hi - lo +1];
        for (int k = lo; k <= hi; k++) {
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
        return;
    }

    public static void main(String[] args) {
        int [] a = new int[]{5,7,8,1,2,7};
        merge(a,0,2,5);
        System.out.println(Arrays.toString(a));
    }
}
