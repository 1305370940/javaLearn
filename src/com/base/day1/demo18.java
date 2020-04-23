package com.base.day1;

import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 18:38
 */
public class demo18 {
    public static void main(String[] args) {
//        2*n-1
        System.out.println("请输入一个正整数");
        Scanner scanner=new Scanner(System.in);
        int height = scanner.nextInt();
        for (int i=0;i<height/2+1;i++){
            for (int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=height/2-1;i>=0;i--){
            for (int j=0;j<i*2+1;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
