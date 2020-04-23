package com.base.day5.Test7;

import java.util.*;

/**
 * @Author: yjf
 * @Date: 2020/4/17 15:16
 */
public class LotterySystem {
    public static void main(String[] args) {
        //奖池
        List<String> pool=new ArrayList<>();
        int i=0;
        while (i<7){
            pool.add(Integer.valueOf((int)(Math.random()*100)).toString());
            i++;
        }
        System.out.println("-------------"+"\t"+"购买彩票"+"------------");
        System.out.println("身份证号：");
        Scanner scanner=new Scanner(System.in);
        String next = scanner.next();
        System.out.println("购买号码：（输入（1-35）的7的数字以逗号隔开）");
        String code = scanner.next();
        System.out.println("-------------"+"\t"+"彩票开奖"+"------------");
        //公布奖池
        System.out.println(pool);
        //分解号码
        String[] codes = code.split(",");
        List<String> strings = Arrays.asList(codes);
        ArrayList<String> strings1 = new ArrayList<>(strings);
        System.out.println("-------------"+"\t"+"兑奖信息"+"------------");
        strings1.retainAll(pool);
        System.out.println("中奖号码："+strings1);
        System.out.println("中将数量："+strings1.size());
        System.out.println("中将金额："+strings1.size()*100);
    }
}
