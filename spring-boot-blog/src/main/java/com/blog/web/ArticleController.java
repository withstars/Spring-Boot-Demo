package com.blog.web;

import com.blog.domain.Admin;
import com.blog.domain.Article;
import com.blog.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class ArticleController {
    @Autowired
    private ArticleService articleService;

    @RequestMapping(value = "/api/article")
    public @ResponseBody
    Object getAdmin(HttpServletRequest request){
        int id=Integer.parseInt(request.getParameter("id"));
        Article article=articleService.getArticleById(id);
        return article;
    }
}
