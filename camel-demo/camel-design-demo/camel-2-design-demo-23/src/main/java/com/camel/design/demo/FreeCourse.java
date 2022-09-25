package com.camel.design.demo;

public class FreeCourse extends Course {

    @Override
    public void accept(IVisitor visitor) {

        /**
         * 在这里加入一些自己的业务逻辑
         * 最后通过了再调用 visitor.visit(this);
         */
        visitor.visit(this);
    }
}
