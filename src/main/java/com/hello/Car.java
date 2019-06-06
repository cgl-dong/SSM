package com.hello;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component("car")
public class Car {
    @Value("小黄车")
    private String name;
    Car(){
        System.out.println("这里是"+name);
    }
    public String show(){
        return "这是注解";
    }
}
