package com.camel.demo.controller;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Title: TestController
 * @Description:
 * @author: wanghaiming
 * @date: 2022/9/15 0015 16:24
 * @Version: 1.0
 */
@RestController
@RequestMapping("/test")
public class TestController {

    /**
     * 阿里
     * 这个可以用来做线程池传递变量！
     */
    private static final ThreadLocal<Map<Integer,Integer>>  transmittableThreadLocal = new TransmittableThreadLocal<>();

    private static ExecutorService threadPoolExecutor = new ThreadPoolExecutor(1, 1, 600L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

    int i = 0;

    /**
     * 不加 TtlRunnable.get(）是无法实现，父线程往子线程传递变量的！
     * 注意  - 这种写法的坑
     *  1.
     * @return
     */
    @GetMapping("/thread2")
    public void thread2(){

        init();

        transmittableThreadLocal.get().put(++i, i);

        System.out.println("主线程set  i 值" + i);
        //提交任务
        threadPoolExecutor.execute(TtlRunnable.get(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("zi线程池传递变量：" + transmittableThreadLocal.get());
        }));

        // 移除
        transmittableThreadLocal.remove();
        System.out.println("主线程结束");

    }

    private void init() {
        Map<Integer, Integer> map = transmittableThreadLocal.get();
        if(map == null){
            LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
            transmittableThreadLocal.set(hashMap);
        }
    }


}
