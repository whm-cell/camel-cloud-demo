package com.camel.design.demo;

public interface IVisitor {

    /**
     * 访问免费课程
     * @param freeCourse
     */
    void visit(FreeCourse freeCourse);

    /**
     * 访问实战课程
     * @param codingCourse
     */
    void visit(CodingCourse codingCourse);
}
