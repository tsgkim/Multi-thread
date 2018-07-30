package com.tsgkim.chapter1.isAlive.section1;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/7/30 下午11:10
 */
public class MyThread extends Thread{

    @Override
    public void run() {
        System.out.println(String.format("IsAlive = %s", isAlive()));
    }
}
