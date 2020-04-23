package com.base.day6;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: yjf
 * @Date: 2020/4/20 14:03
 */
public class ArrayListTest {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        //增
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("0");
        //删
        list.remove("2");
        list.remove(1);
        //改
        list.set(0, "java");
        //查
        System.out.println(list.get(0));
        //是否包含
        System.out.println(list.contains("4"));
        //容量
        System.out.println(list.size());
        //遍历1 foreach
        long l = System.currentTimeMillis();
        for (String str:list
             ) {
            System.out.println(str);
        }
        long l1 = System.currentTimeMillis();
        System.out.println(l1-l);
        //遍历2 for
        for(int i=0;i<list.size();i++){
            System.out.print(list.get(i));
        }
    }
}
