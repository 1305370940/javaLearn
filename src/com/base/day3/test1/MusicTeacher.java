package com.base.day3.test1;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:24
 */
public class MusicTeacher extends Teacher {
    MusicTeacher(String name){
        this.name=name;
    }
    @Override
    public void teachProcedure() {
        this.StartWork(7);
        this.teach("music");
        this.offWork(17);
    }
}
