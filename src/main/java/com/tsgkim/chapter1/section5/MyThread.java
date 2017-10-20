package com.tsgkim.chapter1.section5;

/**
 * Study:
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/21 上午12:32
 **/
public class MyThread extends Thread {

    private int count = 5;

    public MyThread(String name) {
        this.setName(name); // 设置线程名称
    }

    @Override
    public void run() {
        while (count > 0) {
            count--;
            System.out.println("由" + this.currentThread().getName() + "计算，count=" + count);
        }
    }
}
