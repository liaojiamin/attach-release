package com.ljm.attach.demo.btrace;

import com.sun.btrace.annotations.BTrace;
import com.sun.btrace.annotations.OnMethod;
import com.sun.btrace.annotations.ProbeClassName;
import com.sun.btrace.annotations.ProbeMethodName;

import static com.sun.btrace.BTraceUtils.println;

/**
 * 重载方法拦截
 * @author liaojiamin
 * @Date:Created in 16:41 2020/12/8
 */
@BTrace
public class BTracePrintSame {
    @OnMethod(
            clazz = "com.ljm.attach.demo.controller.UserController",
            method = "same"
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, String name){
        println("className: "+ pcn);
        println("methodName: "+ pmn);
        println("name: "+ name);
        println();
    }

    @OnMethod(
            clazz = "com.ljm.attach.demo.controller.UserController",
            method = "same"
    )
    public static void anyRead(@ProbeClassName String pcn, @ProbeMethodName String pmn, int id, String name){
        println("className: "+ pcn);
        println("methodName: "+ pmn);
        println("name: "+ name);
        println("id: "+ id);
        println();
    }


}
