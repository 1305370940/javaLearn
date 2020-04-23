package com.base.day1;

/**
 * @Author: yjf
 * @Date: 2020/4/13 17:37
 */
public class demo12 {
    public static void main(String[] args) {
        Integer a;
        StringBuilder sb=new StringBuilder();
        for (int i=1000;i<=9999;i++){
            a=i;
            sb.append(a);
            if(sb.toString().equals(sb.reverse().toString())){
                System.out.println("回数："+i);
            }
            sb.setLength(0);
        }
    }
}
