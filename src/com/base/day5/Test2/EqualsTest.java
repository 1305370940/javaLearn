package com.base.day5.Test2;

/**
 * @Author: yjf
 * @Date: 2020/4/17 14:13
 */
public class EqualsTest {
    public static void main(String[] args) {
        String str=new String("hello");
        String str1="hello";
        //不是相同对象
        System.out.println(str==str1);
        //equals方法被重写 表示是否是相同值
        System.out.println(str.equals(str1));

    }
}
