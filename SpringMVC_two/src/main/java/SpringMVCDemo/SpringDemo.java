package SpringMVCDemo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mvc")
public class SpringDemo {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
    @RequestMapping("/hello")
    public String hello(HttpServletRequest request){
        request.setAttribute("hello","Tom");
        System.out.println(request.getAttribute("hello"));

        return "hello";
    }
    @RequestMapping(value="/show",method = RequestMethod.POST)
    public String show(String username,String password){
        System.out.println("username: "+username);
        System.out.println("password: "+password);
        return "show";
    }
    @RequestMapping("/reg")
    public String reg(){
        return "redirect:/mvc2/register";
    }
}
