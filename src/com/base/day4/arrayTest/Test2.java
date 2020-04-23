package com.base.day4.arrayTest;

import java.util.Arrays;

/**
 * @Author: yjf
 * @Date: 2020/4/16 15:46
 */
public class Test2 {
    public static void main(String[] args) {
        int[] arr={3,7,16,0,5,0,0,6,7,0,5};
        int count=0;
        for (int i:arr
             ) {
            if(i==0){
                count++;
            }
        }
        int[] arr2=new int[arr.length-count];
        int size=0;
        for (int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr2[size++]=arr[i];
            }
        }
        System.out.println(Arrays.toString(arr2));
    }
}
