package com.withstars;

import org.apache.velocity.app.VelocityEngine;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.ui.velocity.VelocityEngineUtils;

import javax.mail.internet.MimeMessage;
import java.util.HashMap;
import java.util.Map;


/**
 * Created with IntelliJ IDEA.
 * Description: 发送邮件测试
 * User: withstars
 * Date: 2018-04-14
 * Time: 11:01
 * Mail: withstars@126.com
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class SendMailTest {

    @Autowired
    private JavaMailSender mailSender;


    @Test
    public void testSendMail() throws Exception{
        SimpleMailMessage message =new SimpleMailMessage();
        message.setFrom("");
        message.setTo("");
        message.setSubject("");
        message.setText("该邮件由spring boot发送,仅作为测试使用");

        mailSender.send(message);

    }










}
