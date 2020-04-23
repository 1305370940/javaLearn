package com.base.day1;

import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 16:15
 */
public class demo4 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int score = scanner.nextInt();
        int print=0;
        while (true){
            if(score>=90&&score<=100){
                print=1;
            }else if(score>=80&&score<=89){
                print=2;
            }else if(score>=70&&score<=79){
                print=3;
            }else if(score>=60&&score<=69) {
                print = 4;
            }else{
                print=5;
            }
            switch (score){
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("b");
                    break;
                case 3:
                    System.out.println("c");
                    break;
                case 4:
                    System.out.println("d");
                    break;
                case 5:
                    System.out.println("e");
                    break;
            }
        }
    }
}
