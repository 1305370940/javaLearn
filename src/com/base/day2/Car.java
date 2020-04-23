package com.base.day2;

/**
 * @Author: yjf
 * @Date: 2020/4/14 14:51
 */
public class Car {
//    设计Car类属性，构造方法，启动方法，制动方法，说明方法，等
    public Car(){
        System.out.println("构造器");
    }
    public void start(){
        System.out.println("启动...");
    }

    public void stop(){
        System.out.println("制动...");
    }

    public  void decr(){
        System.out.println("说明....");
    }

}
