package com.camel.demo.controller;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.alibaba.ttl.TtlRunnable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
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
    private static final ThreadLocal<Map<Integer,Integer>>  transmittableThreadLocal = new TransmittableThreadLocal<>(){

        @Override
        protected Map<Integer, Integer> initialValue() {
            return new LinkedHashMap<>();
        }

        /**
         * 复写child创建的方法
         * @param parentValue
         * @return
         */
        @Override
        protected Map<Integer, Integer> childValue(Map<Integer, Integer> parentValue) {
            //return super.childValue(parentValue);
            return new LinkedHashMap<>(parentValue); // 让每次transmittableThreadLocal调用的时候，都是一个新的对象
        }

        /**
         * 覆盖ccopy方法，回访的时候，给子线程设置的value不再是父线程的
         *
         * 这样后续父线程的操作，就不会影响到子线程！！！！
         *
         *
         * @param parentValue
         * @return
         */
        @Override
        public Map<Integer, Integer> copy(Map<Integer, Integer> parentValue) {
            return new LinkedHashMap<>(parentValue);
        }
    };

    private static ExecutorService threadPoolExecutor = new ThreadPoolExecutor(1, 1, 600L, TimeUnit.SECONDS, new LinkedBlockingDeque<>());

    int i = 0;

    static{
        // init(); // 这种方式remove不掉之前的线程信息
    }

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

        System.out.println("主线程开始" + transmittableThreadLocal.get());

        System.out.println("主线程set  i 值" + i);
        //提交任务
        threadPoolExecutor.execute(Objects.requireNonNull(TtlRunnable.get(() -> {
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println("zi线程池传递变量：" + transmittableThreadLocal.get());
        })));


        // 在这里再次put的时候，子线程也能感知到！
        /**
         *
         */
        transmittableThreadLocal.get().put(++i, i);
        System.out.println("主线程提交过任务后再set  i 值" + i);

        // 移除
        transmittableThreadLocal.remove();
        System.out.println("主线程结束");

    }

    private static void init() {
        Map<Integer, Integer> map = transmittableThreadLocal.get();
        if(map == null){
            System.out.println("线程init");
            LinkedHashMap<Integer, Integer> hashMap = new LinkedHashMap<>();
            transmittableThreadLocal.set(hashMap);
        }
    }


}
