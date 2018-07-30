package com.tsgkim.chapter1.section8;

public class Run {

    /**
     * 测试发现，需要执行 main 方法才能看出执行效果，@Test 无法看出效果
     * @param args
     */
    public static void main(String[] args) {

        ALogin aLogin = new ALogin();
        BLogin bLogin = new BLogin();

        Thread a = new Thread(aLogin, "a");
        Thread b = new Thread(bLogin, "b");

        a.start();
        b.start();

    }

}
