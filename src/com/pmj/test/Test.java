package com.pmj.test;

import com.pmj.sort.Bubble;

import java.util.Arrays;

/**
 * @author 彭明久
 * @since 2021-01-12
 */
public class Test {
    public static void main(String[] args) {

        int[] arr = {1, 4, 3, 6, 9, 7};
        Bubble.sort(arr);
        System.out.println(Arrays.toString(arr));
    }


}
