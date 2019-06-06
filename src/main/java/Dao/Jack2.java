package Dao;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.File;
import java.io.IOException;

public class Jack2 {
    public static void main(String[] args) throws IOException {
        //这里的转义符号
        String json = "{\"name\":\"小民\",\"age\":20,\"color\":\"yellow\"}";

        /**
         * ObjectMapper支持从byte[]、File、InputStream、字符串等数据的JSON反序列化。
         */
        ObjectMapper mapper = new ObjectMapper();
        JackUser user = mapper.readValue(json, JackUser.class);
        System.out.println(user.getName());
        System.out.println(user.getColor());
        System.out.println(user.getAge());
    }
    @Test
    public void test() throws IOException {
        ObjectMapper mapper=new ObjectMapper();
        JackUser user=mapper.readValue(new File("F:\\js.json"),JackUser.class);
        System.out.println(user.getName());
        System.out.println(user.getColor());
        System.out.println(user.getAge());
    }
}

