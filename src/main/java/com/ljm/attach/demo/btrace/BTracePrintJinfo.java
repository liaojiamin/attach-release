package com.ljm.attach.demo.btrace;

import com.sun.btrace.BTraceUtils;
import com.sun.btrace.annotations.BTrace;

/**
 * @author liaojiamin
 * @Date:Created in 17:46 2020/12/8
 */
@BTrace
public class BTracePrintJinfo {
    static {
        // 打印系统属性
        BTraceUtils.println("System Properties:");
        BTraceUtils.printProperties();
        BTraceUtils.println();
        // 打印JVM参数
        BTraceUtils.println("VM Flags:");
        BTraceUtils.printVmArguments();
        BTraceUtils.println();

        // 打印环境变量
        BTraceUtils.println("OS Enviroment:");
        BTraceUtils.printEnv();
        BTraceUtils.println();

        // 退出脚本
        BTraceUtils.exit(0);
    }
}
