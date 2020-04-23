package com.base.day2;

/**
 * @Author: yjf
 * @Date: 2020/4/14 14:56
 */
public class TestStudent {
    public static void main(String[] args) {
        Student student=new Student("zhangsan", 20, 11111);
        student.showAge();
        student.showId();
        student.showName();
    }
}
