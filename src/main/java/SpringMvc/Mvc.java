package SpringMvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class Mvc {
    @RequestMapping("/hello")
    public String hello(){
        return "hello";
    }
}
