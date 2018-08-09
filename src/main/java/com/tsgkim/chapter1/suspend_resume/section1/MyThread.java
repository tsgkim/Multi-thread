package com.tsgkim.chapter1.suspend_resume.section1;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/8/10 上午12:46
 */
public class MyThread extends Thread {

    private int i = 0;

    @Override
    public void run() {

        while (true) {

            i ++ ;

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }
}
