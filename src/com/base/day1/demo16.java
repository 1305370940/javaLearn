package com.base.day1;

import javax.sound.midi.Soundbank;

/**
 * @Author: yjf
 * @Date: 2020/4/13 18:23
 */
public class demo16 {
    public static void main(String[] args) {
        double height=100;
        double count=0;
        for (int i=0;i<10;i++){
            count+=height;
            height=height/2;
        }
        System.out.println("最后高度："+height);
        System.out.println("弹跳位移："+count);
    }
}
