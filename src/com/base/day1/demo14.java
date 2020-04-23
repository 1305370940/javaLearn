package com.base.day1;

import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 18:00
 */
public class demo14 {
    public static void main(String[] args) {
        System.out.println("请输入一个1-9之间的正整数:");
        Scanner scanner=new Scanner(System.in);
        int count = scanner.nextInt();
        StringBuilder sb=new StringBuilder();
        if(count>=1&&count<=9){
            int result=0;
            for (int i=0;i<5;i++){
                sb.append("1");
            }
            for (int j=0;j<5;j++){
                result+=Integer.parseInt(sb.toString());
                if(sb.length()>1){
                    sb.deleteCharAt(0);
                }
            }
            System.out.println(result);
        }
    }
}
