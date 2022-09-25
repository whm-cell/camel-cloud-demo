package com.camel.design.demo;


/**
 * @author Administrator
 * 实战课程 这里面需要一个价格
 */
public class CodingCourse extends Course{

    private double price;

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void accept(IVisitor visitor) {
        visitor.visit(this);
    }
}
