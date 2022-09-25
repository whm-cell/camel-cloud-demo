package com.camel.design.demo;

public class OpenCourseVideo implements Command {
    private CourseVideo courseVideo;

    public OpenCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
