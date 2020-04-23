package com.base.day1;

import sun.awt.Symbol;

import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 17:02
 */
public class demo8 {
    public static void main(String[] args) {
        System.out.println("请输入正整数n");
        Scanner scanner=new Scanner(System.in);
        int n = scanner.nextInt();
        int count=1;
        for (int i = 0; i<n; i++){
            count*=n-i;
        }
        System.out.println("n!为"+count);
    }
}
