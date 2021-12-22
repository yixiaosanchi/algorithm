package com.unclefrank.algorithm;

import java.util.Arrays;

/**
 * @author Frank.Zhou
 * @email zhouxiukai@payworth.cn
 * @description 冒泡排序,时间负载度为O(n^2)
 * @since 2021/12/22 10:18 下午
 */
public class MaoPaoPaiXu {

    public static void main(String[] args) {
        int[] arr = {3,2,4,5,6,3,3,4,6,7,8,9,10};
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i] > arr[j]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

}
