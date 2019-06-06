package yes;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.annotation.Resource;

public class PeoTest {
    @Autowired
    public Food food;
    @Test
    public void test(){
        String xmlpath="bean2.xml";
        ApplicationContext applicationContext= new ClassPathXmlApplicationContext(xmlpath);
        People p=(People)applicationContext.getBean("peo");
        //通过get方法打印值
        System.out.println(p.getName());
        //通过show方法
        p.show();
        p.disPlay();
        //单元测试中出现问题java.lang.NullPointerException
        //System.out.println(food.getName());
}
}
