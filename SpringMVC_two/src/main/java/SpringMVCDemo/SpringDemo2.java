package SpringMVCDemo;


import model.model.Aderess;
import model.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/mvc2")
public class SpringDemo2 {
    @RequestMapping("/register")
    public String register(){
      return "/register.jsp";
    }
    @RequestMapping("/model2")
    public String model2( User user){
        System.out.println(user.getUsername());
        return "show";
    }
    @RequestMapping("/model3")
    public String model3( User user,Model model){
        user.setUsername("Tom");
        model.addAttribute("username",user.getUsername());
        return "redirect:/mvc2/model2";
    }
}
