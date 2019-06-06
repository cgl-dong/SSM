package Dao;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Jack1 {
    public static void main(String[] args) throws JsonProcessingException {
        JackUser user = new JackUser();
        user.setAge(10);
        user.setColor("blue");
        user.setName("Jack");

        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writeValueAsString(user);
        System.out.println(json);
    }
    @Test
    public void test() throws JsonProcessingException {
        JackUser user = new JackUser();
        user.setAge(10);
        user.setColor("blue");
        user.setName("Jack");
        List<JackUser> users = new ArrayList<>();
        users.add(user);
        ObjectMapper mapper=new ObjectMapper();
        String jsonlist = mapper.writeValueAsString(users);
        System.out.println(jsonlist);
    }
    @Test
    public void test2() throws JsonProcessingException {
        String xmlpath= "bean.xml";
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext(xmlpath);
        JackUser jackUser=(JackUser) applicationContext.getBean("jackUser");
        ObjectMapper mapper=new ObjectMapper();
        String json=mapper.writeValueAsString(jackUser);
        System.out.println(json);
    }
    @Test
    public void test3() throws IOException {
        JackUser user = new JackUser();
        user.setAge(10);
        user.setColor("blue");
        user.setName("Jack");
        ObjectMapper mapper=new ObjectMapper();
        //使用writeValue方法写入文件
        mapper.writeValue(new File("F:\\js.json"),user);

    }
}
