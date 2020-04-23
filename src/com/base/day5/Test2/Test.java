package com.base.day5.Test2;

/**
 * @Author: yjf
 * @Date: 2020/4/17 14:18
 */
public class Test {
    public static void main(String[] args) {
        Person p=new Person("zhangsan",20);
        Person p2=new Person("zhangsan",20);
        System.out.println(p.equals(p2));
    }
}
