package Demo;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;

@Controller
@RequestMapping("/One")
public class One {
    @RequestMapping("/Ajax")
    public String  Hello(){
        return "AjaxJquery.html";
    }
    @RequestMapping("/us")
    public void us(Users users){
        System.out.println(users);
    }
    @RequestMapping("/uss")
    @ResponseBody
    public Users aj(Users users, HttpServletResponse response) throws Exception {

        return users;
    }
}
