package com.ljm.attach.demo.btrace;

import com.sun.btrace.AnyType;
import com.sun.btrace.annotations.*;
import static com.sun.btrace.BTraceUtils.*;
import static com.sun.btrace.BTraceUtils.Strings.strcat;

/**
 * 获取参数，结果，执行时间
 * @author liaojiamin
 * @Date:Created in 12:23 2020/12/8
 */
@BTrace
public class BTracePrintArgSimple {
    @OnMethod(
            clazz = "com.ljm.attach.demo.service.impl.UserServiceImpl",
            method = "getById",
            location = @Location(Kind.RETURN)
    )
    public static void func(Long b, @Return String result, @Duration long time){
        println("release stack:");
        jstack();
        println(strcat("method paramB:",str(b)));
        println("cost time : " + time);
        println(strcat("method result",str(result)));
        println();
    }
}
