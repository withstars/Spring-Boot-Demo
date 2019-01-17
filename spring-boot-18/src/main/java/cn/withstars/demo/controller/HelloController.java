package cn.withstars.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;


@Controller
public class HelloController {

    @ResponseBody
    @GetMapping("/hello")
    public Object hello(){
        return "Welcome to the site.";
    }

    @ResponseBody
    @GetMapping("/hello2")
    public Object hello2(HttpServletRequest req){
        return "Welcome to the site." + req.getParameter("username") +","+req.getParameter("password");
    }
}
