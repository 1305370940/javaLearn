package com.base.day4.arrayTest;

import java.util.Arrays;

/**
 * @Author: yjf
 * @Date: 2020/4/16 16:13
 */
public class Test5 {
    public static void main(String[] args) {
        int[] arr=new int[20];
        arr[0]=1;
        arr[1]=1;
        for (int i=2;i<arr.length;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        System.out.println(Arrays.toString(arr));
    }
}
