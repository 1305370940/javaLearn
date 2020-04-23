package com.base.day1;

import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 17:09
 */
public class demo9 {
    public static void main(String[] args) {
        System.out.println("请输入一个正整数");
        Scanner scanner=new Scanner(System.in);
        int s = scanner.nextInt();
        for(int i=2;i<s;i++){
            if(s%i==0){
                System.out.println(s+"不是素数");
                return;
            }
        }
        System.out.println(s+"是素数");
    }
}
