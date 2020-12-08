package com.ljm.attach.demo.visualvm;

import java.util.Random;

/**
 * @author liaojiamin
 * @Date:Created in 18:29 2020/12/7
 */

public class BTraceDemo {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Random random = new Random();
        while (true) {
            System.out.println(calculator.add(random.nextInt(10), random.nextInt(10)));
        }
    }
}
