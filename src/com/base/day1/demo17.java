package com.base.day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @Author: yjf
 * @Date: 2020/4/13 18:29
 */
public class demo17 {
    public static void main(String[] args) {
        System.out.println("输入三个整数");
        Scanner scanner=new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int max= Math.max((Math.max(a, b)), c);
        int min=Math.min(Math.min(a, b), c);
        List<Integer> list=new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);
        list.remove(Integer.valueOf(max));
        list.remove(Integer.valueOf(min));
        System.out.println(min+","+list.get(0)+","+max);
    }
}
