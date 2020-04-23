package com.base.day5;

import java.util.Arrays;

/**
 * @Author: yjf
 * @Date: 2020/4/17 10:01
 */
public class StringTest {
    public static void main(String[] args) {
        String str="i,Love,java";
        String str1=" java is great ";
        System.out.println(str.length());
        System.out.println(str.equals(str1));
        System.out.println(str.endsWith("mm"));
        System.out.println(str.toLowerCase());
        System.out.println(str1.trim());
        System.out.println(str.substring(3));
        System.out.println(str1.substring(0,5));
        String[] split = str.split(",");
        System.out.println(Arrays.toString(split));
        System.out.println(split[1].length());
        System.out.println(split[0].length());
        System.out.println(split[2].length());
    }
}
