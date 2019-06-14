package com.hfut.advice;

import org.springframework.aop.ThrowsAdvice;

import javax.servlet.ServletException;
import java.lang.reflect.Method;
public class MyThrow implements ThrowsAdvice {
    public void afterThrowing(Exception ex){
        System.out.println("执行异常通知-schema-base方式");
    }
}
