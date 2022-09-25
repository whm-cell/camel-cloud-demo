package com.camel.design.demo;

public class Test {
    public static void main(String[] args) {
        Course course = new Course();
        course.setName("Java设计模式精讲");
        course.setArticle("Java设计模式精讲手记");
        course.setVideo("Java设计模式精讲视频");

        Approver articleApprover = new At();
        Approver videoApprover = new VideoApprover();
        articleApprover.setNextApprover(videoApprover);

        articleApprover.deploy(course);
    }
}
