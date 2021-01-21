package com.pmj.sort;

import java.util.Arrays;

/**
 * @author 彭明久
 * @since 2021-01-16
 */
public class Quick {
    public static void sort(Integer[] arr) {
        sort(arr, 0, arr.length - 1);
    }

    private static void sort(Integer[] arr, int start, int end) {
        if (end <= start) return;
        int sk;
        int value = arr[start];//分解值
        int p1 = start;
        int p2 = end + 1;
        while (true) {
            while (arr[--p2] >= value) {
                if (p2 == start) break;
            }
            while (arr[++p1] < value) {
                if (p1 == end) break;
            }
            if (p1 >= p2) break;
            int min = arr[p2];
            arr[p2] = arr[p1];
            arr[p1] = min;
        }
        int min = arr[p2];
        arr[p2] = arr[start];
        arr[start] = min;
        sk = p2;

        sort(arr, start, sk - 1);
        sort(arr, sk + 1, end);
    }
}
