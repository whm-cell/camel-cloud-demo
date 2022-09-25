package com.camel.design.demo;

public class PlayState extends CourseStateVideo {



    @Override
    public void play() {
        System.out.println("正常播放课程视频状态");
    }
    @Override
    public void speed() {
        super.courseVideoContext.setCourseStateVideo(CourseVideoContext.SPEED_STATE);
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
