package com.base.day4.arrayTest;

import java.util.Arrays;

/**
 * @Author: yjf
 * @Date: 2020/4/16 16:15
 */
public class Test6 {
    public static void main(String[] args) {
        int[] arr=new int[10];
        int size=0;
        int a=35;
        while (a>0){
            arr[size++]=a%2;
            a=a/2;
        }
        for (int i=size-1;i>=0;i--){
            System.out.print(arr[i]);
        }
    }
}
