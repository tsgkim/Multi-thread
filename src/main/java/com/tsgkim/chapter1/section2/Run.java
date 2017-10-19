package com.tsgkim.chapter1.section2;

import org.junit.Test;

/**
 * Study:
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/19 下午11:14
 **/
public class Run {

    @Test
    /*
        Thread.java中的 start() 方法是系统安排一个时间来调用 Threa 中 run() 方法
        线程具有随机性，CPU执行哪个线程具有不确定性
        执行 start() 方法的顺序不代表线程启动的顺序 ==》 com.tsgkim.chapter1.section3 中有具体代码说明
     */
    public void myStartTest() {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.start();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    // Thread.java中的 run() 方法是由 main 主线来调用 run() 方法，必须等 run() 方法中代码执行完之后再执行后面的代码
    public void myRunTest() {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.run();
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("main=" + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
