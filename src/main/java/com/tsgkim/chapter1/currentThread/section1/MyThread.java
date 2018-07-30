package com.tsgkim.chapter1.currentThread.section1;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/7/30 下午10:55
 */
public class MyThread extends Thread {

    public MyThread() {
        System.out.println(String.format("Constructor method print thread name = %s", currentThread().getName()));
    }

    @Override
    public void run() {
        System.out.println(String.format("Run_Start method print thread name = %s", currentThread().getName()));
    }
}
