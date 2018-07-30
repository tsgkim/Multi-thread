package com.tsgkim.chapter1.section8;

public class BLogin extends Thread{

    @Override
    public void run() {
        LoginServlet.doPost("b", "bb", currentThread().getName());
    }
}
