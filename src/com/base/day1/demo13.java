package com.base.day1;

import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 17:49
 */
public class demo13 {
    public static void main(String[] args) {
        System.out.println("请输入两个正整数");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int max= Math.max(a, b);
        int min=Math.min(a, b);
        int maxcount=1;
        for(int i=min;i>0;i--){
            if(max%i==0&&min%i==0){
                maxcount=i;
                break;
            }
        }
        System.out.println("最大公约数为"+maxcount);
        System.out.println("最小公倍数为"+(a*b)/maxcount);
    }
}
