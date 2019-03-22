package com.spring.bootcloud.reflection;

import java.lang.reflect.Method;

/*
    模拟spring boot启动过程
    反射调用test方法
 */
public class Test {
    public static void main(String[] args) throws Exception {
        Class<?> clazz = Test2.class;
        Method method = clazz.getDeclaredMethod("test2", null);
        method.invoke(new Test2(), null);
    }
}
