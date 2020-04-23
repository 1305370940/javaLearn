package com.base.day1;

/**
 * @Author: yjf
 * @Date: 2020/4/13 09:52
 */
public class demo {
    public static void main(String[] args) {
        System.out.println("hello");
        String str2 = 3.5f + "";
        System.out.println(str2);
        System.out.println(4+3+"aaa");
        byte a=7;
        a= (byte) (a+2);
        char c = 'a';
        int  i = 5;
        double d = .314;
        double result = c+i+d;
        int x = 1,y = 1;
        if(x++==1 || ++y==1){
            x =7;
        }
        System.out.println("x="+x+",y="+y);
        int n = 5,m = 13;
        n=m+n-n;

        System.out.println(n+""+m);
        float f=3.4f;
        System.out.println(1+2+"aa");
    }

}
