package com.tsgkim.chapter1.section1;

import org.junit.Test;

/**
 * Study:
 * 使用多线程技术时，代码运行结果与代码执行顺序或者调用顺序无关
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/18 下午11:48
 **/
public class Run {

    // 有可能先打印 运行结束  再打印 MyThread
    @Test
    public void myRun() {
        MyThread myThread = new MyThread();

        // 如果多次调用 start() 会抛出异常  Exception in thread "main" java.lang.IllegalThreadStateException
//        for (int i=0; i<20;i++){
//            myThread.start();
//        }

        myThread.start();
        System.out.println("运行结束");
    }
}
