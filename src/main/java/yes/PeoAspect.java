package yes;

import org.springframework.stereotype.Component;

@Component
public class PeoAspect {
    public void before(){
        System.out.println("开始了。。。");
    }
    public  void after(){
        System.out.println("结束了。。。");
    }
    public void other(){
        System.out.println("我在这里。。。");
    }
}
