package com.base.day1;

/**
 * @Author: yjf
 * @Date: 2020/4/13 17:31
 */
public class demo11 {
    public static void main(String[] args) {
        int n=1;
        for (int i=1;i<=100;i++){
            for(int j=1;j<=100-i;j++){
                for(int k=3;k<=100-i-j;k+=3){
                    if(i*5+j*3+k/3==100){
                        System.out.println("方案"+(n++)+"--> "+i+" "+j+" "+k);
                    }
                }
            }
        }
    }
}
