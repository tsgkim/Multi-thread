package com.tsgkim.chapter1.section6;

import org.junit.Test;

/**
 * Study:
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/21 上午9:59
 **/
public class Start {

    /**
     * 非线程安全的共享变量
     * 有可能出现两个线程同时处理同一个变量值的情况
     */
    @Test
    public void myTest() {

        MyThread myThread = new MyThread();
        Thread a = new Thread(myThread, "A");
        Thread b = new Thread(myThread, "B");
        Thread c = new Thread(myThread, "C");
        Thread d = new Thread(myThread, "D");

        a.start();
        b.start();
        c.start();
        d.start();

    }
}
