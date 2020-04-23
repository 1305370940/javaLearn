package com.base.day1;

/**
 * @Author: yjf
 * @Date: 2020/4/13 16:56
 */
public class demo6 {
    public static void main(String[] args) {
        for(int i=1990;i<=2050;i++){
            if(i%4==0&&i%100!=0||i%400==0){
                System.out.println(i);
            }
        }
    }
}
