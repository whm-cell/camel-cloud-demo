package com.camel.design.demo;

/**
 * @author Administrator
 */
public abstract class CourseStateVideo {
    protected CourseVideoContext courseVideoContext;

    public  void setCourseVideoContext(CourseVideoContext courseVideoContext) {
        this.courseVideoContext = courseVideoContext;
    }

    public abstract void play();
    public abstract void speed();
    public abstract void pause();
    public abstract void stop();
}
