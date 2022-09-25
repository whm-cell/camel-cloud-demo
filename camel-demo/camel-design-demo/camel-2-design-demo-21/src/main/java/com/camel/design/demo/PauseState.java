package com.camel.design.demo;

public class PauseState extends CourseStateVideo {

    @Override
    public void play() {
        super.courseVideoContext.setCourseStateVideo(CourseVideoContext.PLAY_STATE);
    }

    @Override
    public void speed() {
        System.out.println("错误状态");
    }

    @Override
    public void pause() {
        System.out.println("暂停播放课程视频状态");
    }

    @Override
    public void stop() {
        super.courseVideoContext.setCourseStateVideo(CourseVideoContext.STOP_STATE);
    }
}
