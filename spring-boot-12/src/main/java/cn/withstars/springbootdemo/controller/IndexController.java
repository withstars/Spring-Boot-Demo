package cn.withstars.springbootdemo.controller;


import cn.withstars.springbootdemo.exception.MyException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 21:14
 * Mail: withstars@126.com
 */
@Controller
public class IndexController {

    @RequestMapping("/hi")
    public String toHi(){
        return "index";
    }

    @RequestMapping("/json")
    public String toJson() throws MyException{
        throw new MyException("发送MyException异常!");
    }

    @RequestMapping("/ha")
    public String toHa() throws Exception{
        throw new Exception("Server Internal Occured Exception");
    }


}
