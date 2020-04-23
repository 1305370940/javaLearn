package com.base.day3.test5;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:57
 */
public class Test {
    public static void main(String[] args) {
        Employee.setCompany("阿里巴巴公司");
        Employee e1=new Employee(1001);
        Employee e2=new Employee(1002, "腾讯", 2000, "张三", 20, "男");
        e1.play();
        e2.sing();
    }
}
