package com.base.day3.test1;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:24
 */
public class SoftwareTeacher extends Teacher {
    SoftwareTeacher(String name){
        this.name=name;
    }
    @Override
    public void teachProcedure() {
        this.StartWork(7);
        this.teach("software");
        this.offWork(17);
    }
}
