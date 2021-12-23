package com.imcbb.trace;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.MDC;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.UUID;

/**
 * @author kevin
 * @desc 创建拦截器，嵌入mdc日志追踪
 * @date 2021/12/23 10:42
 */
@Slf4j
@Component
public class ControllerInterceptor implements HandlerInterceptor {

    private static final String TRACE_ID = "traceId";

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String traceId = String.valueOf(UUID.randomUUID());
        MDC.put(TRACE_ID, TraceUtil.getTraceId());
        log.debug("Into interceptor...,TRACE_ID:{}", traceId);
        return HandlerInterceptor.super.preHandle(request, response, handler);
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        log.debug("Complete interceptor...,TRACE_ID:{}", MDC.get(TRACE_ID));
        MDC.clear();
        HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
    }
}
