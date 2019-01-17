package cn.withstars.jwtdemo.controller;

import cn.withstars.jwtdemo.util.JwtUtil;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;

import static cn.withstars.jwtdemo.util.JwtUtil.USER_NAME;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(){
        return "Welcome to the site.";
    }


    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public Object login(HttpServletResponse response, HttpServletRequest req)throws IOException {
        if(isValidPassword(req.getParameter("username"), req.getParameter("password"))) {
            String jwt = JwtUtil.generateToken(req.getParameter("username"));
            return new HashMap<String,String>(){{
                put("token", jwt);
            }};
        }else {
            return new ResponseEntity(HttpStatus.UNAUTHORIZED);
        }
    }

    @ResponseBody
    @RequestMapping(value = "/api/protect", method = RequestMethod.GET)
    public Object protectHello(@RequestHeader(value = USER_NAME)String userId){
        return "Welcome to the protect api, you userid = " + userId;
    }


    private boolean isValidPassword(String username, String password) {
        return "admin".equals(username)
                && "admin".equals(password);
    }


}
