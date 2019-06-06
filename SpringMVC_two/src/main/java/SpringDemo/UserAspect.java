package SpringDemo;

import org.springframework.stereotype.Component;

@Component
public class UserAspect {
 public void before(){
     System.out.println("前置。。。。");
 }
 public void after(){
     System.out.println("后置。。。。");
 }
}
