package threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

/**
 * Copyright 2018/2/24 lcfarm All Rights Reserved
 * 请添加类/接口的说明：
 *
 * @Package: map
 * @author: Jerrik
 * @date: 2018/2/24 9:54
 */
public class CacheThreadPoolClient {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newCachedThreadPool();

        for(int i=0;i<5;i++){
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    try {
                        TimeUnit.SECONDS.sleep(1000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            });
            System.out.println("thread-> " + Thread.currentThread().getId());
        }
    }
}
