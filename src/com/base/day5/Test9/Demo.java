package com.base.day5.Test9;

/**
 * @Author: yjf
 * @Date: 2020/4/17 20:59
 */
public class Demo {
    public static void main(String[] args) {
        int i=0;
        while(true){
            i++;
            if(i%2==1&&i%3==0&&i%4==1&&i%5==4&&i%6==3&&i%7==0&&i%8==1&&i%9==0){
                break;
            }
        }
        System.out.println(i);
    }
}
