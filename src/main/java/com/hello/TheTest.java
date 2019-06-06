package com.hello;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import com.arakelian.spring.test.*;

import javax.annotation.Resource;
//整合测试文件
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"file:/bean.xml"})
//@ContextConfiguration("classpath:bean.xml")
public class TheTest {
    @Test
    public void test(){

       String xmlpath= "src/bean.xml";
       //1、ClassPathXmlApplicationContext：读取classpath下的资源
        //2:FileSystemXmlApplicationContext:读取指定路径下的资源
        ApplicationContext applicationContext=new FileSystemXmlApplicationContext(xmlpath);
        Userd userd=(Userd)applicationContext.getBean("bean1");
        //Car c=(Car)applicationContext.getBean("car");
        userd.addUser();


        //c.show();
    }
   /* @Resource(name="bean1")
    Userd userd;*/
    @Test
    public void t(){

        String xmlpath= "src/reos/bean.xml";
        //1、ClassPathXmlApplicationContext：读取classpath下的资源
        //2:FileSystemXmlApplicationContext:读取指定路径下的资源
        //ApplicationContext applicationContext=new FileSystemXmlApplicationContext(xmlpath);
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("bean.xml");
        //因为实现了接口，所以需要定义接口类型
        User userd=(User)applicationContext.getBean("bean1");

        userd.addUser();
    }
}
