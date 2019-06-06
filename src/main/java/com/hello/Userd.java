package com.hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

@Component("bean1")
public class Userd implements User {
    @Value("Tom")
    public String name;
    @Resource
    //@Autowired两种注解方式
    private Car c;

    @Override
    public void addUser() {
        System.out.println("hello...");
        System.out.println(this.name);
        System.out.println(c.show());
    }

}
