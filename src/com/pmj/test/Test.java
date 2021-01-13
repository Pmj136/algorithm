package com.pmj.test;

import com.pmj.sort.Selection;

import java.util.Arrays;

/**
 * @author 彭明久
 * @since 2021-01-12
 */
public class Test {
    public static void main(String[] args) {

        int[] arr = {8, 1, 4, 3, 6, 9, 7, 22, 9, 0, 234, 4, 55, 23, 656, 77, 44, 5544, 5, 1, 1, 1, 2, 3, 54};
        Selection.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
