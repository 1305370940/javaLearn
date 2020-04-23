package com.base.day1;

import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 15:32
 */
public class demo2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1.矩形 2.三角形 3.园");
            System.out.println("请选择：");
            int i = sc.nextInt();
            if(i==1){
                System.out.println("请输入长：");
                int width = sc.nextInt();
                System.out.println("请输入宽：");
                int height = sc.nextInt();
                System.out.println("面积为："+width*height);
            }else if(i==2){
                System.out.println("请输入三边长度");
                int a = sc.nextInt();
                int b = sc.nextInt();
                int c = sc.nextInt();
                int p=(a+b+c)/2;
                double area=Math.sqrt(p*(p-a)*(p-b)*(p-c));
                System.out.println("三角形面积为："+area);
            }else if(i==3){
                System.out.println("请输入半径");
                int radius = sc.nextInt();
                System.out.println("面积为："+ Math.PI*radius*radius);
            }
        }
    }
}
