package com.camel.design.demo;

public class SpeddState extends CourseStateVideo {

    @Override
    public void play() {
        super.courseVideoContext.setCourseStateVideo(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("快进播放课程视频状态");
    }

    @Override
    public void pause() {
        super.courseVideoContext.setCourseStateVideo(CourseVideoContext.PAUSE_STATE);
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseStateVideo(CourseVideoContext.STOP_STATE);
    }
}
