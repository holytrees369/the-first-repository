package com.yushi.thread.threadpool.securecreate;

/**
 * @author HolyTrees
 * @date 2020-10-28  上午 11:56
 */
public class Demo02RunnableImpl implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"线程执行了任务");
    }
}
