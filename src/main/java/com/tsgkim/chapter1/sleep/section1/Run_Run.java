package com.tsgkim.chapter1.sleep.section1;

import org.junit.Test;


/**
 * @author: shiguang.tu
 * @create: 2018/8/4 下午8:16
 */
public class Run_Run {

    @Test
    public void testStart() {

        MyThread myThread = new MyThread();

        System.out.println(String.format("Begin time = %s", System.currentTimeMillis()));

        myThread.start();

        System.out.println(String.format("End time = %s", System.currentTimeMillis()));

    }

    @Test
    public void testRun() {

        MyThread myThread = new MyThread();

        System.out.println(String.format("Begin time = %s", System.currentTimeMillis()));

        myThread.run();

        System.out.println(String.format("End time = %s", System.currentTimeMillis()));

    }

}
