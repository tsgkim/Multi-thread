package com.tsgkim.chapter1.sleep.section1;

/**
 * @author: shiguang.tu
 * @create: 2018/8/4 下午8:12
 */
public class MyThread extends Thread {

    @Override
    public void run() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

}
