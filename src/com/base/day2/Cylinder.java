package com.base.day2;

/**
 * @Author: yjf
 * @Date: 2020/4/14 15:02
 */
public class Cylinder {
    /*
    * （2）编写一个圆柱体类Cylinder，它继承于上面的Circle类。还拥有：
        ①一个成员变量
        double hight（私有，浮点型）；  // 圆柱体的高；
        ②构造方法
        Cylinder (double r, double  h )           //创建Circle对象时将半径初始化为r
        ③ 成员方法
        double getVolume( )             //获取圆柱体的体积
        void  showVolume( )             //将圆柱体的体积输出到屏幕
        编写应用程序，创建类的对象，分别设置圆的半径、圆柱体的高，计算并显示圆半径、圆面积、圆周长，圆柱体的体积。
    * */
    private double height;
    private double r;
    private double volume;
    public Cylinder(double r,double height){
        this.height=height;
        this.r=r;
    }

    public double getVolume(){
        return this.volume=Math.PI*this.r*this.r*this.height;
    }

    public void showVolume(){
        System.out.println("体积为："+this.volume);
    }
}
