package com.base.day5;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @Author: yjf
 * @Date: 2020/4/17 10:25
 */
public class CalenderTest {
    public static void main(String[] args) {
        Calendar c=new GregorianCalendar();
        System.out.println(c.get(Calendar.YEAR));
        System.out.println(c.get(Calendar.MONTH));
        System.out.println(c.get(Calendar.DAY_OF_MONTH));
    }
}
