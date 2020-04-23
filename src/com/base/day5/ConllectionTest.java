package com.base.day5;

import java.util.*;

/**
 * @Author: yjf
 * @Date: 2020/4/17 11:16
 */
public class ConllectionTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(6);
        System.out.println(list);
        Set<Integer> set=new HashSet<>(list);
        System.out.println(set);
    }
}
