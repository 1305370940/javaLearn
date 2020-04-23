package com.base.day3.test4;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:37
 */
public class FireProofDoor extends Door implements FireSafe{
    @Override
    void open() {
        System.out.println("打开防火门");
    }

    @Override
    void close() {
        System.out.println("关闭防火门");
    }

    @Override
    public void fireProof() {
        System.out.println("fireProof");
    }
}
