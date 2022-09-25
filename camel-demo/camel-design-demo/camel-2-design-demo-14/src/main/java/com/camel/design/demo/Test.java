package com.camel.design.demo;

public class Test {
    public static void main(String[] args) {
        CourseVideo courseVideo = new CourseVideo("Java设计模式精讲");
        Command openCourseVideo = new OpenCourseVideo(courseVideo);
        Command closeCourseVideo = new CloseCourseVideo(courseVideo);
        Staff staff = new Staff();
        staff.addCommand(openCourseVideo);
        staff.addCommand(closeCourseVideo);
        staff.executeCommands();
    }
}
