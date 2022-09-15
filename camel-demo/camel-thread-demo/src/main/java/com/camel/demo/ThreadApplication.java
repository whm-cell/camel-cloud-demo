package com.camel.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Title: ThreadAppracation
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/15 0015 16:24
 * @Version: 1.0
 */
@SpringBootApplication
public class ThreadApplication {

        public static void main(String[] args) {
            SpringApplication.run(ThreadApplication.class, args);
            System.out.println("启动层高");
        }

}
