package com.hello;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserdTest {
    //这里是测试文件
    @Test
    public void test() {
        String xmlPath = "src/bean.xml";
        //1.获取配置文件
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(xmlPath);
        //2.创建对象，此处默认了id
        Userd userd = (Userd) applicationContext.getBean("bean1");
        Car c=(Car)applicationContext.getBean("car");
        //3.此时可以调用方法
        userd.addUser();
        c.show();
    }
}