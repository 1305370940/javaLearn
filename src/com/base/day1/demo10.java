package com.base.day1;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 17:12
 */
public class demo10 {
    public static void main(String[] args) {
        System.out.println("请输入塔高度");
        Scanner scanner=new Scanner(System.in);
        int height = scanner.nextInt();
//        2*n+3
        for (int i=0;i<height;i++){
            for (int k=0;k<height-i;k++){
                System.out.print(" ");
            }
            for (int j=0;j<2*i+3;j++){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
