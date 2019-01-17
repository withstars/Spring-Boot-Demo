package cn.withstars.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class HelloController {

    private Logger logger = LoggerFactory.getLogger(HelloController.class);

    @ResponseBody
    @GetMapping("/hello")
    public Object hello(){
        logger.info("Execute hello method.");
        return "Welcome to the site.";
    }
}
