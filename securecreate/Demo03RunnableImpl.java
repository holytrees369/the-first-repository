package com.yushi.thread.threadpool.securecreate;

/**
 * @author HolyTrees
 * @date 2020-10-28  下午 13:38
 */
public class Demo03RunnableImpl implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
