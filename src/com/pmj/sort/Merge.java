package com.pmj.sort;

/**
 * @author 彭明久
 * @since 2021-01-15
 */
public class Merge {
    private static Integer[] assist;

    public static void sort(Integer[] arr) {
        assist = new Integer[arr.length];
        int start = 0;
        int end = arr.length - 1;

        sort(arr, start, end);
    }

    /*
     * {8, 7, 6, 5, 4, 3, 2, 1}(mid:3)
     * {8, 7, 6, 5}(mid:1) - { 4, 3, 2, 1}(mid:5)
     * {8,7}(mid:0) - {6,5}(mid:2) - {4,3}(mid:4) -{2,1}(mid:6)
     *
     * */
    private static void sort(Integer[] arr, int start, int end) {
        if (end <= start) return;
        //start,end之间的数据分组
        int mid = start + (end - start) / 2;
//        System.out.println(mid);

        //对每一组数据排序
        sort(arr, start, mid);
        sort(arr, mid + 1, end);
        //再把各组数据归并

        merge(arr, start, mid, end);
    }

    private static void merge(Integer[] arr, int start, int mid, int end) {
        //定义三个指针
        int p1 = start;//0
        int p2 = mid + 1;//2
        int p = start;//0
        while (p1 <= mid && p2 <= end) {
            if (arr[p1] < arr[p2])
                assist[p++] = arr[p1++];
            else
                assist[p++] = arr[p2++];
        }
        while (p1 <= mid) {
            assist[p++] = arr[p1++];
        }
        while (p2 <= end) {
            assist[p++] = arr[p2++];
        }
        if (end + 1 - start >= 0) System.arraycopy(assist, start, arr, start, end + 1 - start);
    }
}
