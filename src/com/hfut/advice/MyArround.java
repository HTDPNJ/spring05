package com.hfut.advice;



import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

public class MyArround implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("环绕-前置");
        Object result=methodInvocation.proceed(); //放行，调用切点方式
        System.out.println("环绕-后置");
        return result;
    }
}
