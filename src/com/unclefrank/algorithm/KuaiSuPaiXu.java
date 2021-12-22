package com.unclefrank.algorithm;

import java.util.Arrays;

/**
 * @author Frank.Zhou
 * @email zhouxiukai@payworth.cn
 * @description  快速排序，时间复杂度为O(nlogn)
 * @since 2021/12/22 10:23 下午
 */
public class KuaiSuPaiXu {

    public static void main(String[] args) {
        int[] arr = {3,4,2,4,6,7,8,9,7,3,2,1};
        sort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    public static void sort(int[] arr, int start, int end){
        if(start >= end){
            return;
        }
        int base = arr[start];
        int i = start;
        int j = end;
        while (i < j) {
            while (i < j && arr[j] >= base) {
                j--;
            }
            if(i < j){
                arr[i] = arr[j];
            }
            while (i < j && arr[i] <= base) {
                i++;
            }
            if(i < j){
                arr[j] = arr[i];
            }
            if(i >= j){
                arr[i] = base;
            }
        }
        sort(arr, start, i-1);
        sort(arr, j+1 , end);
    }

}
