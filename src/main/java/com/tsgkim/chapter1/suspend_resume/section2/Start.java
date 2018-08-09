package com.tsgkim.chapter1.suspend_resume.section2;

import org.junit.Test;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/8/10 上午1:04
 */
public class Start {

    @Test
    public void myTest() throws InterruptedException {

        final SyncObject syncObject = new SyncObject();

        Thread thread1 = new Thread() {
            @Override
            public void run() {
                syncObject.print();
            }
        };

        thread1.setName("a");
        thread1.start();

        Thread.sleep(2000);

        Thread thread2 = new Thread() {
            @Override
            public void run() {
                syncObject.print();
            }
        };

        thread2.start();

    }

}
