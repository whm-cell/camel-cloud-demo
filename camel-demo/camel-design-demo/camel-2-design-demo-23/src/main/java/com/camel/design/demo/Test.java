package com.camel.design.demo;

import java.util.ArrayList;
import java.util.List;

public class Test {

    // 对相同的数据结构进行不同的操作 , 这里面的数据结构就是课程

    public static void main(String[] args) {

        List<Course> courseList = new ArrayList<Course>();

        FreeCourse freeCourse = new FreeCourse();
        freeCourse.setName("SpringMVC数据绑定");
        CodingCourse codingCourse = new CodingCourse();
        codingCourse.setName("Java设计模式精讲");
        codingCourse.setPrice(299);

        courseList.add(freeCourse);
        courseList.add(codingCourse);

        for (Course course : courseList) {

            // 这里可以进行断点 ，查看visitor的类型

            course.accept(new Visitor());
        }

    }
}
