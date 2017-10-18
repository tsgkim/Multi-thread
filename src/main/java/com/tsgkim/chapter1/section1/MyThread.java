package com.tsgkim.chapter1.section1;

/**
 *
 * Study:
 *      多线程实现两种方式：1. extends Thread  2. implements Runnable
 *
 *      Tread结构类：
 *          public class Thread implements Runnable
 *      ==》Thread 类实现了 Runnable 接口
 *          继承 Thread 类局限性是 不支持多继承 ， 为支持多继承，可以实现 Runnalbe 接口
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/18 下午11:33
 **/
public class MyThread extends Thread  {

    @Override
    public void run() {
        super.run();
        System.out.println("MyThread");
    }
}
