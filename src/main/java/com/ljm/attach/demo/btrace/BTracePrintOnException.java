package com.ljm.attach.demo.btrace;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.*;

import static com.sun.btrace.BTraceUtils.*;

/**
 * @author liaojiamin
 * @Date:Created in 17:13 2020/12/8
 */
@BTrace
public class BTracePrintOnException {
    @TLS
    static Throwable currentException;

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow(@Self Throwable self) {
        //new Throwable()
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lent.Throwable",
            method = "<init>"
    )
    public static void onthrow1(@Self Throwable self, String s) {
        //new Throwable(String msg)
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lent.Throwable",
            method = "<init>"
    )
    public static void onthrow1(@Self Throwable self, String s, Throwable cause) {
        //new Throwable(String msg, Throwable cause)
        currentException = self;
    }

    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>"
    )
    public static void onthrow2(@Self Throwable self, Throwable cause) {
        //new Throwable(Throwable cause)
        currentException = self;
    }


    // print the currentException's stack trace.
    @OnMethod(
            clazz = "java.lang.Throwable",
            method = "<init>",
            location = @Location(Kind.RETURN)
    )
    public static void onthrowreturn() {
        if (currentException != null) {
            // 打印异常堆栈
            Threads.jstack(currentException);
            println("=====================");
            // 打印完之后就置空
            currentException = null;
        }
    }

}
