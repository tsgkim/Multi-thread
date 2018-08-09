package com.tsgkim.chapter1.suspend_resume.section2;

/**
 *
 * @author: shiguang.tu
 * @create: 2018/8/10 上午12:59
 */
public class SyncObject {

    synchronized public void print() {

        System.out.println("Begin execute print()");

        if ("a".equals(Thread.currentThread().getName())) {

            System.out.println("a 线程造成公共的同步对象独占，其它线程无法访问公共同步对象");
            Thread.currentThread().suspend();

        }

        System.out.println("End execute print()");

    }

}
