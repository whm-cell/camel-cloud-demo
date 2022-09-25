package com.camel.design.demo;

public class CloseCourseVideo implements Command {
    private CourseVideo courseVideo;

    public CloseCourseVideo(CourseVideo courseVideo) {
        this.courseVideo = courseVideo;
    }

    @Override
    public void execute() {
        courseVideo.open();
    }
}
