package com.base.day5.Test5;

/**
 * @Author: yjf
 * @Date: 2020/4/17 14:27
 */
public class StringBufferTest {
    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("hello");
        sb.append("ja").append("va");
        System.out.println(sb);
        sb.insert(0, "aaa");
        System.out.println(sb);
        sb.replace(0, 3, "bbb");
        System.out.println(sb);
    }
}
