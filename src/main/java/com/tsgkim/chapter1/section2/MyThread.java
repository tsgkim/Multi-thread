package com.tsgkim.chapter1.section2;

/**
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/19 下午10:36
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                int time = (int) (Math.random() * 1000);
                Thread.sleep(time);
                System.out.println("run=" + Thread.currentThread().getName());
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
