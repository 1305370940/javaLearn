package com.base.day3.test3;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:33
 */
public class Bus implements Vehicle{
    @Override
    public void start() {
        System.out.println("启动bus。。。");
    }

    @Override
    public void stop() {
        System.out.println("停下bus。。。");
    }
}
