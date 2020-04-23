package com.base.day3.test4;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:38
 */
public class Test {
    public static void main(String[] args) {
        FireProofDoor FireProofDoor=new FireProofDoor();
        BulletProofDoor bulletProofDoor=new BulletProofDoor();
        FireProofDoor.open();
        FireProofDoor.fireProof();
        FireProofDoor.close();
        bulletProofDoor.open();
        bulletProofDoor.bulletProof();
        bulletProofDoor.close();
    }
}
