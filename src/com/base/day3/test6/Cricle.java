package com.base.day3.test6;

/**
 * @Author: yjf
 * @Date: 2020/4/15 16:03
 */
public class Cricle implements Shape2D{
    private double r;
    Cricle(double r){
        this.r=r;
    }

    /**
     *
     * @return 周长
     */
    @Override
    public double grith() {
        return 2*PI*r;
    }

    /**
     *
     * @return 面积
     */
    @Override
    public double area() {
        return PI*r*r;
    }
}
