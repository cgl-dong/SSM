package com.hello;

import org.springframework.stereotype.Component;

@Component("useraspect")
public class Useraspect {
    public static void before(){
        System.out.println("开始事务。。。");
    }
    public static void after(){
        System.out.println("结束了。。。");
    }
}
