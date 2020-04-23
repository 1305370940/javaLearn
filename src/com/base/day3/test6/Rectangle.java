package com.base.day3.test6;

/**
 * @Author: yjf
 * @Date: 2020/4/15 16:05
 */
public class Rectangle implements Shape2D{
    private double height;
    private double width;
    Rectangle(double height,double width){
        this.height=height;
        this.width=width;
    }
    @Override
    public double grith() {
        return (height+width)*2;
    }

    @Override
    public double area() {
        return height*width;
    }
}
