package com.ljm.attach.demo.btrace;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.println;

/**
 * 判断代码是否执行到34行
 * @author liaojiamin
 * @Date:Created in 17:22 2020/12/8
 */
@BTrace
public class BTracePrintLine {
    @OnMethod(
            clazz = "com.ljm.attach.demo.controller.UserController",
            method = "arg1",
            location = @Location(value = Kind.LINE, line = 34)
    )
    public static void readLine(@ProbeClassName String pcn, @ProbeMethodName String pmn, int line ){
        println("className: "+ pcn);
        println("methodName: "+ pmn);
        println("line" + line);
        println();
    }
}
