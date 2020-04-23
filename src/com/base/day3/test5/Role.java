package com.base.day3.test5;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:42
 */
public abstract class Role {
    private String name;
    private Integer age;
    private  String sex;
    public Role(){

    }
    public Role(String name,Integer age,String sex){
        this();
        this.name=name;
        this.age=age;
        this.sex=sex;
    }

    abstract void play();
    void say(){
        System.out.println("say Hello!");
    }
    final void sing(){
        System.out.println("sing...");
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
