package com.tsgkim.chapter1.section3;

import org.junit.Test;

/**
 * Study:
 *
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/20 上午12:03
 **/
public class Run {

    @Test
    // 执行 start() 方法顺序不达标线程启动的顺序
    public void myTest(){
        MyThread myThread1 = new MyThread(1);
        MyThread myThread2 = new MyThread(2);
        MyThread myThread3 = new MyThread(3);
        MyThread myThread4 = new MyThread(4);
        MyThread myThread5 = new MyThread(5);
        MyThread myThread6 = new MyThread(6);
        MyThread myThread7 = new MyThread(7);
        MyThread myThread8 = new MyThread(8);
        MyThread myThread9 = new MyThread(9);
        MyThread myThread10 = new MyThread(10);
        MyThread myThread11 = new MyThread(11);
        MyThread myThread12 = new MyThread(12);

        myThread1.start();
        myThread2.start();
        myThread3.start();
        myThread4.start();
        myThread5.start();
        myThread6.start();
        myThread7.start();
        myThread8.start();
        myThread9.start();
        myThread10.start();
        myThread11.start();
        myThread12.start();

    }
}
