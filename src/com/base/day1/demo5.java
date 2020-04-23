package com.base.day1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 16:46
 */
public class demo5 {
    public static void main(String[] args) {
        System.out.println("请输入时间和路程：");
        Scanner scanner=new Scanner(System.in);
        int time = scanner.nextInt();
        int distance = scanner.nextInt();
        if(time>=0&&time<=5){
            time+=24;
        }
        if(time>=6&&time<=21){
            if(distance<=2&&distance>0){
                System.out.println("价格："+(6+1));
            }else{
                System.out.println("价格："+((distance-2)*1.5+6+1));
            }
        }else if(time>=22&&time<=29){
            if(distance<=2&&distance>0){
                System.out.println("价格："+7+1);
            }else{
                System.out.println("价格："+((distance-2)*1.5+7+1));
            }
        }
    }
}
