package com.base.day4.arrayTest;

/**
 * @Author: yjf
 * @Date: 2020/4/16 15:43
 */
public class Test1 {
    public static void main(String[] args) {
        int[] arr={1,2,3,1,0};
        for (int i:arr) {
            for (int j:arr) {
                if(i==j){
                    System.out.println("有重复");
                    return;
                }
            }
        }
        System.out.println("无重复");
    }
}
