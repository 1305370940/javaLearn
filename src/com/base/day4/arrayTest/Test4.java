package com.base.day4.arrayTest;

import java.util.Arrays;

/**
 * @Author: yjf
 * @Date: 2020/4/16 16:00
 */
public class Test4 {
    public static void main(String[] args) {
        int[] arr={4,52,4,8,213,456,7,8,9,1};
        boolean flag=false;
        for (int i=0;i<arr.length-1;i++){
            for (int j=0;j<arr.length-1-i;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if(!flag){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
