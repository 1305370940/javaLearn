package com.base.day6;

/**
 * @Author: yjf
 * @Date: 2020/4/20 14:45
 */
public class ExceptionTest {
    public static void main(String[] args) {
        try {
            int a=10/0;
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    /**
        * @Description 
        * @Author yjf
        * @Parameters [i, b]
        * @Return  java.lang.Integer
        * @Date 2020/4/20 15:54
        */
    public Integer getOne(Integer i,Integer b){
        return i;
    }
}
