package com.pmj.sort;

/**
 * 冒泡排序
 *
 * @author 彭明久
 * @since 2021-01-12
 */
public class Bubble {
    //3,2,1
    public static void sort(Integer[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }
}
