package com.tsgkim.chapter1.section8;

public class ALogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("a", "aa", currentThread().getName());
    }
}
