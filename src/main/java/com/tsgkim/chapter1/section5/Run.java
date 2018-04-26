package com.tsgkim.chapter1.section5;

import org.junit.Test;

/**
 * Study:
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/21 上午12:44
 **/
public class Run {

    @Test
    // 线程变量不共享
    public void myTest() {
        MyThread myThread1 = new MyThread("A");
        MyThread myThread2 = new MyThread("B");
        MyThread myThread3 = new MyThread("C");

        myThread1.start();
        myThread2.start();
        myThread3.start();

        // 通过测试发现 线程名称在 start() 中有效， 在 run() 中无效
        myThread1.run();
        myThread2.run();
        myThread3.run();
    }
}
