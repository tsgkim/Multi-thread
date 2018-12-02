package com.tsgkim.signal;

import org.apache.commons.lang3.concurrent.BasicThreadFactory;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadLocalRandom;
import java.util.concurrent.atomic.AtomicReference;

/**
 * 10个人坐满一辆车出发
 *
 * @author: shiguang.tu
 * @create: 2018/12/1 5:57 PM
 */
public class MyCyclicBarrier {

    public static void main(String[] args) {

        AtomicReference<Integer> busCounter = new AtomicReference<>(0);

        CyclicBarrier barrier = new CyclicBarrier(10, () -> {

            busCounter.getAndSet(busCounter.get() + 1);

            System.out.println("**********************");

            System.out.println(String.format("第%s辆大巴于%s发车",
                    busCounter.get(),
                    new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date())));

            System.out.println("乘客到达时间如下：");

        });

        ExecutorService executorService1 = Executors.newCachedThreadPool();

        ScheduledExecutorService executorService = new ScheduledThreadPoolExecutor(10,
                new BasicThreadFactory.Builder().namingPattern("example-schedule-pool-%d").daemon(false).build());

        //共50名乘客
        for (int i = 0; i < 50; i++) {

            executorService.submit(() -> {

                try {

                    // 到达时间随机
                    Thread.sleep(ThreadLocalRandom.current().nextInt(10000));

                    String arriveTime = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(new Date());

                    int await = barrier.await();

                    System.out.println(String.format("第%s位乘客于%s到达", (10 - await), arriveTime));

                } catch (BrokenBarrierException | InterruptedException e) {
                    e.printStackTrace();
                }

            });

        }

        executorService.shutdown();
    }

}
