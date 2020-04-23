package com.base.day4;

import java.util.Arrays;
import java.util.Collections;

/**
 * @Author: yjf
 * @Date: 2020/4/16 11:25
 */
public class ArraysDemo {
    public static void main(String[] args) {
        int[] a={1,2,3,4,5,6,7,2};
        System.out.println(Arrays.toString(a));
        System.out.println(Arrays.binarySearch(a, 5));
        int[] ints = Arrays.copyOf(a, 3);
        System.out.println(Arrays.toString(ints));
        //全部替换
        Arrays.fill(a, 8);
        System.out.println(Arrays.toString(a));
        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));
    }
}
