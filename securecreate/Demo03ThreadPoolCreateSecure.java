package com.yushi.thread.threadpool.securecreate;

import java.util.concurrent.*;

/**
 * @author HolyTrees
 * @date 2020-10-28  下午 13:40
 */
public class Demo03ThreadPoolCreateSecure {
    public static void main(String[] args) {

    }
    private static ExecutorService executor = new ThreadPoolExecutor(
            5,100,10L,TimeUnit.SECONDS,
            new ArrayBlockingQueue<>(10)
    );
}
