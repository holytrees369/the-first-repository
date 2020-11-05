package com.yushi.thread.threadpool.securecreate;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/**
 * 避免使用Executors类工厂创建线程池；因为可能发生OOM
 * 这里使用ThreadPool的构造函数来创建线程
 *
 * @author HolyTrees
 * @date 2020-10-28  上午 11:44
 */
public class Demo02ThreadPoolCreateSecure {
    public static void main(String[] args) {
        Demo02RunnableImpl one = new Demo02RunnableImpl();
        Demo02RunnableImpl two = new Demo02RunnableImpl();
        Demo02RunnableImpl three = new Demo02RunnableImpl();
        executor.submit(one);
        executor.submit(two);
        executor.submit(three);
        executor.shutdown();
    }
    /**
     * 使用ThreadPool中的构造函数创建线程
     */
    private static ExecutorService executor = new ThreadPoolExecutor(
            10,10,60L, TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(10)
    );
}
