package com.example.demo.controller;

import com.example.demo.po.Msg;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

    @RequestMapping("/")
    public String root(){
        return "redirect:/index";
    }

    @RequestMapping("/index")
    public String index(Model model){
        Msg msg=new Msg("测试标题","测试内容","额外信息,只对管理员显示 ");
        model.addAttribute("msg",msg);
        return "home";
    }

    @GetMapping("/login")
    public String login(){
        return "login";
    }

}
