package com.camel.design.demo;

public abstract class Course {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * 是否接受它的访问
     * @param visitor
     */
    public abstract void accept(IVisitor visitor);
}
