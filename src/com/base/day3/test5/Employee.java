package com.base.day3.test5;

/**
 * @Author: yjf
 * @Date: 2020/4/15 15:47
 */
public class Employee extends Role{
    private final Integer ID;
    private static String company;
    private double salary;
    public Employee(Integer id){
        super();
        ID = id;
    }
    public Employee(Integer id,String company,double salary,String name,Integer age,String sex){
        super(name,age,sex);
        ID = id;
        Employee.company =company;
        this.salary=salary;
    }

    public Integer getId() {
        return ID;
    }

    public static String getCompany() {
        return company;
    }

    public static void setCompany(String company) {
        Employee.company = company;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    void play() {
        super.say();
        System.out.println("Employee play");
    }
}
