package redisdemo;

import org.junit.Test;
import redis.clients.jedis.Jedis;

public class RedisDemo {
    @Test
    public void redisdemo(){
        Jedis jedis=new Jedis();
        //jedis.set("one","You are right");
        String one = jedis.get("one");
        System.out.println(one);
        jedis.close();
    }
}
