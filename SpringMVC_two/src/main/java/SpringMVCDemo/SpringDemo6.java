package SpringMVCDemo;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
@RequestMapping("/mvc6")
public class SpringDemo6 {
    @RequestMapping("/Ajax")
    public String Ajax(){
        return "forward:/html/AjaxJquery.html";
    }
    @RequestMapping("/req")
    public void id(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String name=request.getParameter("name");
        String age=request.getParameter("age");
        System.out.println("name:"+name+"  age:"+age);
        Users users=new Users();
        users.setName("Dava");
        users.setAge(age);
        ObjectMapper js=new ObjectMapper();
        String data=js.writeValueAsString(users);
        response.getWriter().write(data);

    }
    @RequestMapping("/req2")
    public void id2(Users users){
        System.out.println(users);
        System.out.println(users.getName());
        System.out.println(users.getAge());
    }
}
