package com.base.day3.test1;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:19
 */
public abstract class Teacher {
    Integer id;
    String name;
    String sex;
    Integer age;
    String education;
    String teacherTitle;
    public void StartWork(int time){
        System.out.println(this.name+time+"上班");
    }
    public void offWork(int time){
        System.out.println(this.name+time+"下班");
    }
    public void teach(String course){
        System.out.println(this.name+"教"+course);
    }
    abstract public void teachProcedure();
}
