package cn.withstars.demo;

import cn.withstars.demo.domain.Comment;
import cn.withstars.demo.domain.CommentRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

    @Test
    public void contextLoads() {
    }

    @Autowired
    CommentRepository commentRepository;

    @Test
    public void jpaTest1(){

        Comment comment = new Comment();
        comment.setId(1);
        comment.setContent("这是一条测试内容");

        commentRepository.save(comment);
    }

    @Test
    public void jpaTest2(){

        List<Comment> comments= commentRepository.findAll();
        System.out.println(comments);
    }

}

