package com.tsgkim.chapter3.waitAndNotify;

/**
 * 
 * @author: shiguang.tu
 * @create: 2018/11/27 5:27 PM
 */
public class Test1 {

    /**
     * 没有对代码块加锁，wait() 无效
     */
    public static void main(String[] args) throws InterruptedException {

        String ss = null;
        ss.wait();

    }


}
