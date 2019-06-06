package com.hello;

import org.springframework.cglib.proxy.Enhancer;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class TheAspect {
    public static Userd createService(){
        System.out.println("......");
        //1 目标类
        final Userd userService = new Userd();
        //2切面类
        final Useraspect myAspect = new Useraspect();
        // 3.代理类 ，采用cglib，底层创建目标类的子类
        //3.1 核心类
        Enhancer enhancer = new Enhancer();
        //3.2 确定父类
        enhancer.setSuperclass(userService.getClass());
        /* 3.3 设置回调函数 , MethodInterceptor接口 等效 jdk InvocationHandler接口
         *  intercept() 等效 jdk  invoke()
         *      参数1、参数2、参数3：以invoke一样
         *      参数4：methodProxy 方法的代理
         *
         *
         */
        enhancer.setCallback(new MethodInterceptor(){

            @Override
            public Object intercept(Object proxy, Method method, Object[] args, MethodProxy methodProxy) throws Throwable {

                //前
                Useraspect.before();

                //执行目标类的方法
                Object obj = method.invoke(userService, args);
                // * 执行代理类的父类 ，执行目标类 （目标类和代理类 父子关系）
                methodProxy.invokeSuper(proxy, args);

                //后
                Useraspect.after();

                return obj;
            }
        });
        //3.4 创建代理
        Userd proxService = (Userd) enhancer.create();

        return proxService;
    }

}
