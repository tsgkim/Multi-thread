package com.tsgkim.chapter1.section4;

import com.tsgkim.chapter1.section1.MyThread;
import org.junit.Test;

/**
 * Study:
 *
 * @Description:
 * @author: shiguang.tu
 * @create: 17/10/21 上午12:11
 **/
public class Run {

    /*
        Thread implements Runnable
        Thread 构造方法中 可传入 Runnable 对象
        ==》可以将一个 Thread 对象中的 run() 方法交由其它线程进行调用
     */
    @Test
    public void myTest() {
        Runnable runnable = new MyRunnable();
        Thread thread1 = new Thread(runnable);
        thread1.start();

        Thread thread2 = new MyThread();
        Thread thread3 = new Thread(thread2);
        thread3.start();

        System.out.println("运行结束！");
    }
}
