package com.tsgkim.chapter1.section6;

/**
 * Study:
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/21 上午9:56
 **/
public class MyThread extends Thread {

    private int count = 5;

    @Override
    public void run() {
        super.run();
        count--;
        System.out.println("由" + this.currentThread().getName() + "计算count=" + count);
    }
}
