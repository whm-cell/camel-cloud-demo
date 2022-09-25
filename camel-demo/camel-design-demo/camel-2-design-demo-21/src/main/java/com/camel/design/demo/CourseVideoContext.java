package com.camel.design.demo;

public class CourseVideoContext {

    private CourseStateVideo courseStateVideo;

    public final static PlayState PLAY_STATE = new PlayState();

    public final static SpeddState SPEED_STATE = new SpeddState();

    public final static PauseState PAUSE_STATE = new PauseState();

    public final static StopState STOP_STATE = new StopState();

    public CourseStateVideo getCourseStateVideo() {
        return courseStateVideo;
    }

    public void play(){
        this.courseStateVideo.play();
    }

    public void speed(){
        this.courseStateVideo.speed();
    }

    public void pause(){
        this.courseStateVideo.pause();
    }

    public void stop(){
        this.courseStateVideo.stop();
    }


    public void setCourseStateVideo(CourseStateVideo courseStateVideo) {
        this.courseStateVideo = courseStateVideo;
        this.courseStateVideo.setCourseVideoContext(this);

    }
}
