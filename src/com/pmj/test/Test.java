package com.pmj.test;

import com.pmj.sort.Insertion;

import java.util.Arrays;

/**
 * @author 彭明久
 * @since 2021-01-12
 */
public class Test {
    public static void main(String[] args) {

        int[] arr = {3, 7, 8, 2, 1, 0, 2, 8, 3, 8, 4, 9, 1, 22, 44, 66};
        Insertion.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
