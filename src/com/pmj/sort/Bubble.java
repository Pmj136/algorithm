package com.pmj.sort;

/**
 * 冒泡排序
 *
 * @author 彭明久
 * @since 2021-01-12
 */
public class Bubble {
    public static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int max = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = max;
                }
            }
        }
    }
}
