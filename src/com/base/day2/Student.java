package com.base.day2;

/**
 * @Author: yjf
 * @Date: 2020/4/14 14:53
 */
public class Student {
    private String name;
    private Integer age;
    private Integer id;

    public Student(String name,Integer age,Integer id){
        this.name=name;
        this.age=age;
        this.id=id;
    }

    public void showName(){
        System.out.println(this.name);
    }
    public void showAge(){
        System.out.println(this.age);
    }
    public void showId(){
        System.out.println(this.id);
    }
}
