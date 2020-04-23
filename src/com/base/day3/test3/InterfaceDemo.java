package com.base.day3.test3;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:35
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        Vehicle bike=new Bike();
        Vehicle bus=new Bus();
        bike.start();
        bike.stop();
        bus.start();
        bus.stop();
    }
}
