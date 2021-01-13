package com.pmj.sort;

import java.util.Arrays;

/**
 * 插入排序
 *
 * @author 彭明久
 * @since 2021-01-13
 */
public class Insertion {
    public static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (arr[j] > arr[j - 1]) break;
                int min = arr[j];
                arr[j] = arr[j - 1];
                arr[j - 1] = min;
            }
        }
    }
}
