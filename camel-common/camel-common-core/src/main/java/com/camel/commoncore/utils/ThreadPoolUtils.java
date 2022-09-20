package com.camel.commoncore.utils;


import com.google.common.util.concurrent.ThreadFactoryBuilder;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * @Title: ThreadBaseUtils
 * @Description:
 * @author: wanghaiming
 * @date: 2022/5/18 0018 15:12
 * @Version: 1.0
 */
public class ThreadPoolUtils {

    /**
     * 初始化线程池
     *     1、corePoolSize：核心线程数
     *         * 核心线程会一直存活，及时没有任务需要执行
     *         * 当线程数小于核心线程数时，即使有线程空闲，线程池也会优先创建新线程处理
     *         * 设置allowCoreThreadTimeout=true（默认false）时，核心线程会超时关闭
     *
     *     2、queueCapacity：任务队列容量（阻塞队列）
     *         * 当核心线程数达到最大时，新任务会放在队列中排队等待执行
     *
     *     3、maxPoolSize：最大线程数
     *         * 当线程数>=corePoolSize，且任务队列已满时。线程池会创建新线程来处理任务
     *         * 当线程数=maxPoolSize，且任务队列已满时，线程池会拒绝处理任务而抛出异常
     *
     *     4、 keepAliveTime：线程空闲时间
     *         * 当线程空闲时间达到keepAliveTime时，线程会退出，直到线程数量=corePoolSize
     *         * 如果allowCoreThreadTimeout=true，则会直到线程数量=0
     *
     *     5、allowCoreThreadTimeout：允许核心线程超时
     *     6、rejectedExecutionHandler：任务拒绝处理器
     *         * 两种情况会拒绝处理任务：
     *             - 当线程数已经达到maxPoolSize，切队列已满，会拒绝新任务
     *             - 当线程池被调用shutdown()后，会等待线程池里的任务执行完毕，再shutdown。如果在调用shutdown()和线程池真正shutdown之间提交任务，会拒绝新任务
     *         * 线程池会调用rejectedExecutionHandler来处理这个任务。如果没有设置默认是AbortPolicy，会抛出异常
     *         * ThreadPoolExecutor类有几个内部实现类来处理这类情况：
     *             - AbortPolicy 丢弃任务，抛运行时异常
     *             - CallerRunsPolicy 执行任务
     *             - DiscardPolicy 忽视，什么都不会发生
     *             - DiscardOldestPolicy 从队列中踢出最先进入队列（最后一个执行）的任务
     *         * 实现RejectedExecutionHandler接口，可自定义处理器
     * @return
     */

    /**
     * 获取系统处理器个数，作为线程池数量
     */
    private static int nThreads = Runtime.getRuntime().availableProcessors();
    private static ThreadFactory namedThreadFactory = new ThreadFactoryBuilder()
                .setNameFormat("demo-pool-%d").build();

    /**
     * Common Thread Pool
     */
    private static final ThreadPoolExecutor pool = new ThreadPoolExecutor(nThreads, 200,
                0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<Runnable>(1024), namedThreadFactory, new ThreadPoolExecutor.AbortPolicy());

    /**
     *  返回单例线程池
     * @return
     */
   public static ThreadPoolExecutor getExecutor(){
       return pool;
   }

    /**
     * 关闭线程池 一般用不到
     */
   public static void shutDown(){
       pool.shutdown();
   }
}
