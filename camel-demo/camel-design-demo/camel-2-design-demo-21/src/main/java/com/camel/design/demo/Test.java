package com.camel.design.demo;

public class Test {

    public static void main(String[] args) {

        CourseVideoContext video = new CourseVideoContext();

        // 设置初始状态
        video.setCourseStateVideo(new PlayState());

//        video.setCourseStateVideo(new SpeddState());
//
//        video.setCourseStateVideo(new PauseState());
//
//
//        video.setCourseStateVideo(new StopState());
        System.out.println(video.getCourseStateVideo().getClass().getSimpleName());

        video.speed();
        System.out.println(video.getCourseStateVideo().getClass().getSimpleName());
        video.pause();
        System.out.println(video.getCourseStateVideo().getClass().getSimpleName());

        video.stop();
        System.out.println(video.getCourseStateVideo().getClass().getSimpleName());


    }
}
