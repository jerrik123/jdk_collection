package threadpool;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.TimeUnit;

/**
 * Copyright 2018/2/24 lcfarm All Rights Reserved
 * 请添加类/接口的说明：预启动所有的corePoolSize里的线程
 *
 * @Package: threadpool
 * @author: Jerrik
 * @date: 2018/2/24 15:04
 */
public class PreStartAllThreadClient {
    public static void main(String[] args) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(2, 2, 0,
                TimeUnit.SECONDS, new ArrayBlockingQueue<Runnable>(1));

        //预先启动所有core线程
        threadPoolExecutor.prestartAllCoreThreads();

        //因为core线程预先启动成功,直接将任务添加到workQueue,等待runWorker是从队列里取然后执行。

        Runnable runnable1 = new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("当前线程1: " + Thread.currentThread().getId() + " ,name: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        Runnable runnable2 = new Runnable() {
            @Override
            public void run() {
                try {
                    TimeUnit.SECONDS.sleep(5);
                    System.out.println("当前线程2: " + Thread.currentThread().getId() + " ,name: " + Thread.currentThread().getName());
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        };

        System.out.println("任务地址: " + runnable1);
        System.out.println("任务地址: " + runnable2);

        threadPoolExecutor.execute(runnable1);
        threadPoolExecutor.execute(runnable2);

    }
}
