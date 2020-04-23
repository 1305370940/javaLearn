package com.base.day2;

/**
 * @Author: yjf
 * @Date: 2020/4/14 14:58
 */
public class Circle {
    /*
    * （1）编写一个圆类Circle，该类拥有：
        ①一个成员变量
        Radius（私有，浮点型）；  // 存放圆的半径；
        ②两个构造方法
        Circle( )                 // 将半径设为0
        Circle(double  r )         //创建Circle对象时将半径初始化为r
        ③ 三个成员方法
        double getArea( )       //获取圆的面积
        double getPerimeter( )   //获取圆的周长
        void  show( )          //将圆的半径、周长、面积输出到屏幕
    * */
    private double radius;
    private double area;
    private double perimeter;
    public Circle(){
        this.radius=0;
    }
    public Circle(double radius){
        this.radius=radius;
    }

    public double getArea(){
        return this.area=Math.PI*this.radius*this.radius;
    }
    public double getPerimeter(){
        return this.perimeter=2*Math.PI*this.radius;
    }
    public void show(){
        System.out.println(this.radius+"\t"+this.area+"\t"+this.perimeter);
    }
}
