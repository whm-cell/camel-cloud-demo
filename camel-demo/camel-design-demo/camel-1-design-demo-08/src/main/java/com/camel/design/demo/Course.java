package com.camel.design.demo;

/**
 * @Title: Course
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/22 0022 13:36
 * @Version: 1.0
 */
public class Course extends a_最终被使用抽象类{

    private String name;

    private double price;

    public Course(String name, double price) {
        this.name = name;
        this.price = price;
    }


    /**
     * 这里作为结果集展示的时候，课程一般只有名称和价格，所以这里只需要重写这两个方法即可
     * 不需要add 和remove  。 菜单这个时候可能是有add的
     * @return
     */
    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public void print() {
        System.out.println("Course{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}');
    }
}
