package com.tsgkim.chapter1.section8;

/**
 * 
 * @author: shiguang.tu
 * @create: 2018/8/9 上午12:16
 */
public class ALogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa", currentThread().getName());
    }
}
