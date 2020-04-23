package com.base.day5.Test9;

import com.base.day5.Test8.Test8;

/**
 * @Author: yjf
 * @Date: 2020/4/17 20:58
 */
public class Son extends Test8 {
    public static String string;
    public static int i;
    public String getA(){
        return this.a;
    }
    public static void main(String[] args) {
        Son t=new Son();
        t.a="aaa";
    }
}
