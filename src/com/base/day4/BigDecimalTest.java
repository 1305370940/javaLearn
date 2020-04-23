package com.base.day4;

import java.math.BigDecimal;

/**
 * @Author: yjf
 * @Date: 2020/4/16 15:18
 */
public class BigDecimalTest {
    public static void main(String[] args) {
        double a=2.1;
        double b=2.3;
        System.out.println(add(a,b));
        System.out.println(subtract(a,b));
        System.out.println(multiply(a,b));
        System.out.println(divide(a,b));
    }

    public static double add(double a,double b){
        BigDecimal b1=new BigDecimal(a);
        BigDecimal b2=new BigDecimal(b);
        return b1.add(b2).doubleValue();
    }
    public static double subtract(double a,double b){
        BigDecimal b1=new BigDecimal(Double.valueOf(a).toString());
        BigDecimal b2=new BigDecimal(Double.valueOf(b).toString());
        return b1.subtract(b2).doubleValue();
    }
    public static double multiply(double a,double b){
        BigDecimal b1=new BigDecimal(a);
        BigDecimal b2=new BigDecimal(b);
        return b1.multiply(b2).doubleValue();
    }
    public static double divide(double a,double b){
        BigDecimal b1=new BigDecimal(a);
        BigDecimal b2=new BigDecimal(b);
        //除数，保留位数，舍入方式（无法除尽时）
        return b1.divide(b2,2,BigDecimal.ROUND_DOWN).doubleValue();
    }


}
