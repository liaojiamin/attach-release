package com.ljm.attach.demo.btrace;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

import static com.sun.btrace.BTraceUtils.println;

/**
 * 正则匹配所有方法
 * @author liaojiamin
 * @Date:Created in 17:43 2020/12/8
 */
@BTrace
public class BTracePringRegex {
    @OnMethod(
            clazz = "com.ljm.attach.demo.controller.UserController",
            method = "/.*/"
    )
    public static void  anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn){
        println("className: "+ pcn);
        println("methodName: "+ pmn);
        println();
    }
}
