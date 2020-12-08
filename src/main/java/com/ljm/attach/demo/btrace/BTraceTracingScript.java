package com.ljm.attach.demo.btrace;

import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.Strings.strcat;
import static com.sun.btrace.BTraceUtils.*;

/**
 * 第一个测试案例
 * @author liaojiamin
 * @Date:Created in 11:22 2020/12/8
 */
@BTrace
public class BTraceTracingScript {
    @OnMethod(
            clazz = "com.ljm.attach.demo.visualvm.Calculator",
            method = "add",
            location = @Location(Kind.RETURN)
    )
    public static void func(int a, int b, @Return int result, @Duration long time){
        println("release stack:");
        jstack();
        println(strcat("method param A:",str(a)));
        println(strcat("method paramB:",str(b)));
        println("cost time : " + time);
        println(strcat("method result",str(result)));
        println();
    }
}
