package com.ljm.attach.demo.btrace;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.println;

/**
 * 时间筛选
 * @author liaojiamin
 * @Date:Created in 12:02 2020/12/8
 */
@BTrace
public class BTraceCheckOnlineStatus {
    @OnMethod(
            clazz = "com.ljm.attach.demo.service.impl.UserServiceImpl",
            method = "getById",
            location = @Location(value = Kind.RETURN))
    public static void printMethodRunTime(@ProbeMethodName String method, @Duration long duration){
        if(duration > 5000){
            println(method + "cost: " + duration/1000000 + "ms");
        }
        println(method);
    }
}
