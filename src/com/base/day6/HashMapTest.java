package com.base.day6;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @Author: yjf
 * @Date: 2020/4/20 14:09
 */
public class HashMapTest {
    public static void main(String[] args) {
        Map<String,String> map=new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "d");
//        Set<String> entries = map.keySet();
//        Iterator<String> iterator = entries.iterator();
//        while (iterator.hasNext()){
//            System.out.println(map.get(iterator.next()));
//        }

        Set<Map.Entry<String, String>> entries1 = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator1 = entries1.iterator();
        while (iterator1.hasNext()){
            Map.Entry<String, String> next = iterator1.next();
            System.out.println("key:"+next.getKey()+"\t"+"value:"+next.getValue());
        }
    }
}
