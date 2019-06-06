package SpringMVCDemo;

import model.model.Aderess;
import model.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/mvc3")
public class SpringDemo3 {
    @RequestMapping("/demo")
    public String htmldemo(){
        return "forward:/html/htmlDemo_1.html";
    }
    @RequestMapping("/login")
    public String login( Model model){
        Aderess aderess=new Aderess("china","wuhu");
        User user=new User();
        user.setAge(18);
        user.setUsername("Jam");
        user.setAderess(aderess);
        model.addAttribute("username",user.getUsername());
        model.addAttribute("userage",user.getAge());
        model.addAttribute("country",user.getAderess().getCountry());
        return "show";
    }
    @RequestMapping("/login_2")
    public ModelAndView login2(){
        ModelAndView modelAndView=new ModelAndView();
        modelAndView.addObject("hello","tom");
        modelAndView.setViewName("login_2");
        return modelAndView;
    }
    @RequestMapping( "/pojo")
     public void pojo(){
        System.out.println("hello");
     }
}
