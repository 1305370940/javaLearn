package com.base.day4.arrayTest;

import java.util.Arrays;

/**
 * @Author: yjf
 * @Date: 2020/4/16 15:53
 */
public class Test3 {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,6,7,8,9,10};
        double count=0;
        Arrays.sort(arr);
        for (int i=1;i<arr.length-1;i++){
            count+=arr[i];
        }
        System.out.println("平均分为："+count/8);

    }
}
