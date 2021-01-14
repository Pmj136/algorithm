package com.pmj.sort;


/**
 * 希尔排序
 *
 * @author 彭明久
 * @since 2021-01-13
 */
public class Shell {
    public static void sort(Integer[] arr) {
        int h = 1;
        while (h < arr.length / 2) h = 2 * h + 1;
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (arr[j] > arr[j - h]) break;
                    int min = arr[j];
                    arr[j] = arr[j - h];
                    arr[j - h] = min;
                }
            }
            h = h / 2;
        }
    }

}
