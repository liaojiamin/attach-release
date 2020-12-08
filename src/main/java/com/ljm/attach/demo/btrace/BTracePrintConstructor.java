package com.ljm.attach.demo.btrace;

import com.sun.btrace.AnyType;
import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.printArray;
import static com.sun.btrace.BTraceUtils.println;

/**
 * 拦截构造方法
 * @author liaojiamin
 * @Date:Created in 11:40 2020/12/8
 */
@BTrace
public class BTracePrintConstructor {
    @OnMethod(
            clazz = "com.ljm.attach.demo.response.User",
            method = "<init>"
    )
    public static void func(@ProbeClassName String pcn, @ProbeMethodName String pmn, AnyType[] anyType){
        println("ClassName: " + pcn);
        println("MethodName: " + pmn);
        printArray(anyType);
        println();
    }
}
