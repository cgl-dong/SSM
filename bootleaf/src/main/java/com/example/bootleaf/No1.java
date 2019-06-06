package com.example.bootleaf;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

@Controller
public class No1 {
    @RequestMapping("/demo")
    public String demo(){
        return "redirect:no1.html";
    }
    @RequestMapping("/one")
    public String demo2(Model model){
        List<Userss> list=new ArrayList<>();
        Userss userss1=new Userss("曹宇航","20","man","student");
        Userss userss2=new Userss("程浩南","22","man","student");
        Userss userss3=new Userss("陈浩","21","man","student");
        Userss userss4=new Userss("冯晨","21","man","student");
        list.add(userss1);
        list.add(userss2);
        list.add(userss3);
        list.add(userss4);
        model.addAttribute("th","<th>name</th>\n" +
                "        <th>age</th>\n" +
                "        <th>sex</th>\n" +
                "        <th>work</th>");
        model.addAttribute("list",list);
        model.addAttribute("title","<h1 align='center'>人员信息表格</h1>");
        return "one";
    }
    @PostMapping("/usersss")
    public String form(String username,String password){
        System.out.println(username+password);
        return "redirect:no1.html";
    }
    @PostMapping("/ajax")
    @ResponseBody
    public Userss ajax(HttpServletResponse response,String userage,String height)throws Exception{
        response.setContentType("text/html;charset=utf-8");
        System.out.println(userage+height);
        Userss userss5=new Userss("曹宇航","20","man","student");
        //response.getWriter().write(userss5.toString());
        ObjectMapper objectMapper=new ObjectMapper();
        //objectMapper.writeValueAsString(userss5);
        return userss5;
    }
}
