package SpringMVCDemo;

import model.model.Aderess;
import model.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/mvc4")
public class SpringDemo4 {
    @RequestMapping("/door")
    public String door(){
        return "Vuejs";
    }
    @RequestMapping( value = "/hello")
    public String  Hello(String name , Model model){
        System.out.println("hello world!");
        return "forward:/html/htmlDemo_1.html";
    }
    @RequestMapping( value = "/Vue",method = RequestMethod.POST)
    public String Vue(@ModelAttribute("user") User user){
        user.setAderess(new Aderess("Japan","Tokly"));
        return "Vuejs";
    }
}
