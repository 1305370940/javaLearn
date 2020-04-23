package com.base.day5.Test4;

import java.util.Arrays;

/**
 * @Author: yjf
 * @Date: 2020/4/17 14:22
 */
public class StringTest {
    public static void main(String[] args) {
        String str="Hello World";
        System.out.println(str.length());
        System.out.println(str.indexOf('o'));
        System.out.println(str.lastIndexOf('o'));
        String replace = str.replace('l', 'm');
        System.out.println(replace);
        String[] split = str.split("\\s");
        System.out.println(Arrays.toString(split));
        System.out.println(split[0].equals(split[1]));
    }
}
