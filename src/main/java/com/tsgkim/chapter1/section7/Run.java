package com.tsgkim.chapter1.section7;

import org.junit.Test;

/**
 * Study:
 *
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/24 下午11:59
 **/
public class Run {

    // 非线程安全的共享变量
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
