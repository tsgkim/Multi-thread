package com.tsgkim.chapter1.currentThread.section1;

import org.junit.Test;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/7/30 下午10:54
 */
public class Run_Start {

    @Test
    public void myTest(){

        MyThread myThread = new MyThread();

        // .run() 也是被 main 线程调用
        //myThread.run();

        // .start() 另外起一个 Thread-0 线程调用
        myThread.start();

    }


}
