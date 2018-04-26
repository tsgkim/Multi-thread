package com.tsgkim.chapter1.section3;

/**
 *
 * Study:
 *
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/20 上午12:00
 **/
public class MyThread extends Thread{

    private int i;

    public MyThread(int i) {
        this.i = i;
    }

    @Override
    public void run() {
        super.run();

        System.out.println(i);
    }
}
