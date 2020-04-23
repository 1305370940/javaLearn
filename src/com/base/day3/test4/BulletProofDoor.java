package com.base.day3.test4;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:37
 */
public class BulletProofDoor extends Door implements BulletSafe{
    @Override
    public void bulletProof() {
        System.out.println("bulletProof");
    }

    @Override
    void open() {
        System.out.println("打开防弹们");
    }

    @Override
    void close() {
        System.out.println("关闭防弹们");
    }
}
