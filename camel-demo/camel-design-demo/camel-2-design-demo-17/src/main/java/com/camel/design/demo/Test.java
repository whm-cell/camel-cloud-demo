package com.camel.design.demo;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("张三");
        User user2 = new User("李四");
        User user3 = new User("王五");
        User user4 = new User("赵六");
        user1.sendMessage("大家好，我是张三");
        user2.sendMessage("大家好，我是李四");
        user3.sendMessage("大家好，我是王五");
        user4.sendMessage("大家好，我是赵六");
    }
}
