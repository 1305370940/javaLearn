package com.base.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 15:49
 */
public class demo3 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        while (true){
            System.out.println("请输入算式:");
            double a = scanner.nextDouble();
            String b = scanner.next();
            double c = scanner.nextDouble();
            if(!b.equals("")){
                if(b.equals("+")){
                    System.out.println("结果为"+(a+c));
                }else if(b.equals("-")){
                    System.out.println("结果为"+(a-c));
                }else if(b.equals("*")){
                    System.out.println("结果为"+(a*c));
                }else if(b.equals("/")){
                    System.out.println("结果为"+(a/c));
                }
            }
        }
    }
}
