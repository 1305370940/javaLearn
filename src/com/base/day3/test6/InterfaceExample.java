package com.base.day3.test6;

/**
 * @Author: yjf
 * @Date: 2020/4/15 16:07
 */
public class InterfaceExample {
    public static void main(String[] args) {
        Shape2D cricle=new Cricle(2);
        Shape2D rectangle=new Rectangle(10, 20);
        System.out.println("圆周长："+cricle.grith());
        System.out.println("圆面积："+cricle.area());
        System.out.println("长方形周长："+rectangle.grith());
        System.out.println("长方形面积："+rectangle.area());
    }
}
