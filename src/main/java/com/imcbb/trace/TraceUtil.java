package com.imcbb.trace;

import java.util.concurrent.atomic.AtomicLong;

/**
* @desc
* @author kevin
* @date 2021/12/23 10:58
* @throws
*
*/
public interface TraceUtil {

    AtomicLong counter = new AtomicLong(System.nanoTime());

    static String getTraceId() {
        return String.valueOf(counter.getAndIncrement());
    }
}
