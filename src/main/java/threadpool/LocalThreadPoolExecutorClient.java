package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.TimeUnit;

/**
 * Copyright 2018/2/24 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/24 12:57
 */
public class LocalThreadPoolExecutorClient {
    public static void main(String[] args) {
        ExecutorService executorService = new ThreadPoolExecutor(1, Integer.MAX_VALUE,
                60L, TimeUnit.SECONDS,
                new LinkedBlockingDeque<Runnable>());

        for(int i=0;i<5;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            System.out.println("thread-> " + Thread.currentThread().getId());
        }
    }
}
