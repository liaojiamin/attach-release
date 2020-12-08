package com.ljm.attach.demo.visualvm;

/**
 * @author liaojiamin
 * @Date:Created in 18:29 2020/12/7
 */
public class Calculator {

    public int add(int a, int b) {
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return a + b;
    }
}
