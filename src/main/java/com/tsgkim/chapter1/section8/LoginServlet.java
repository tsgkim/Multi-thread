package com.tsgkim.chapter1.section8;

/**
 * 模拟登录
 *
 * @author: shiguang.tu
 * @create: 2018/7/30 下午8:50
 */
public class LoginServlet {

    private static String userNameRef;
    private static String passwordRef;

    private static final String CHECK_USER_NAME_FLAG = "a";

    /**
     * 对比加上 synchronized 和不加上 synchronized 结果
     * @param userName
     * @param password
     * @param threadName
     */
    // synchronized public static void doPost(String userName, String password, String threadName) {
    public static void doPost(String userName, String password, String threadName) {

        try {

            userNameRef = userName;

            if (CHECK_USER_NAME_FLAG.equals(userName)) {
                Thread.sleep(5000);
            }

            passwordRef = password;

            System.out.println(String.format("userNameRef = %s, passwordRef = %s, threadName = %s",
                    userNameRef, passwordRef, threadName));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }
}
