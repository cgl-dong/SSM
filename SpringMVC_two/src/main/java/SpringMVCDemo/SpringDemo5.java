package SpringMVCDemo;

import javafx.print.Printer;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping("/mvc5")
public class SpringDemo5 {
    @RequestMapping("/hello")
    public String Hello(){
        System.out.println("5555");
        return "redirect:/html/AjaxDemo.html";
    }
    @RequestMapping("/ajax")
    public String Ajax(HttpServletRequest request, HttpServletResponse response) throws IOException {
        PrintWriter ps=response.getWriter();
        ps.println("hello");
        System.out.println("ajax可以接受了吗");
        String res="ajax";
        return res;
    }
}
