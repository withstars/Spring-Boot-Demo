package cn.withstars.springbootdemo.rabbit;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-06-13
 * Time: 12:57
 * Mail: withstars@126.com
 */
@Component
public class Sender {

    @Autowired
    private AmqpTemplate amqpTemplate;

    public void send(){
        String context = "hello "+new Date();
        System.out.println("Sender : "+context);
        this.amqpTemplate.convertAndSend("hello", context);
    }
}
