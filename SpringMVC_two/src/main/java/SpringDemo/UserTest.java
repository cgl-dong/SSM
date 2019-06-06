package SpringDemo;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class UserTest {
    @Test
    public void test(){
        String xml="bean.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xml);
        User user= (User) applicationContext.getBean("user");
        System.out.println(user.show());
    }

    @Test
    public void tests(){
        String xml="bean.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xml);
        Users users=(Users)applicationContext.getBean("users");
        users.show();
    }

    @Test
    public void test3(){
        String xml="bean.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xml);
        UsersMan users=(UsersMan) applicationContext.getBean("usersMan");
        users.show();
    }
}
