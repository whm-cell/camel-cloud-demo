package com.camel.design.demo;

/**
 * @author Administrator
 *
 * 这俩visit可能不适用老板查看课程的时候，如果是老板的话，这里最好再创建一个visitor给老板服务！
 */
public class Visitor implements IVisitor {

    /**
     * 访问免费课程
     * @param freeCourse
     */
    @Override
    public void visit(FreeCourse freeCourse) {
        System.out.println("免费课程：" + freeCourse.getName());
    }


    /**
     * 访问实战课程
     * @param codingCourse
     */
    @Override
    public void visit(CodingCourse codingCourse) {
        System.out.println("实战课程：" + codingCourse.getName() + " 价格：" + codingCourse.getPrice());
    }
}
