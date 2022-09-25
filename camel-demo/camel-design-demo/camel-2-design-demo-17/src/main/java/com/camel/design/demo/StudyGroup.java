package com.camel.design.demo;

public class StudyGroup {
    public static void showMessage(User user, String message) {
        System.out.println(new java.util.Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
