package com.tsgkim.chapter1.section2;

import org.junit.Test;

/**
 * Study:
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/19 下午11:14
 **/
public class Start_Run {

    /*
        Thread.java中的 start() 方法是系统安排一个时间来调用 Thread 中 run() 方法
        线程具有随机性，CPU执行哪个线程具有不确定性
        执行 start() 方法的顺序不代表线程启动的顺序 ==》 @see com.tsgkim.chapter1.section3 中有具体代码说明

        第一段代码和第二段代码执行没有先后顺序
     */
    @Test
    public void myStartTest() {

        try {

            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            //********** 第一段代码 begin **********
            myThread.start();
            //********** 第一段代码 end **********

            //********** 第二段代码 begin **********
            for (int i = 0; i < 10; i++) {
                Thread.sleep((int) (Math.random() * 1000));
                System.out.println("main = " + Thread.currentThread().getName());
            }
            //********** 第二段代码 end **********

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // Thread.java中的 run() 方法是由 main 主线来调用 run() 方法，必须等 run() 方法中代码执行完之后再执行后面的代码
    @Test
    public void myRunTest() {
        try {
            MyThread myThread = new MyThread();
            myThread.setName("myThread");
            myThread.run();

            for (int i = 0; i < 10; i++) {
                Thread.sleep((int) (Math.random() * 1000));
                System.out.println("main = " + Thread.currentThread().getName());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
