package com.blog.service;

import com.blog.dao.ArticleDao;
import com.blog.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ArticleService {
    @Autowired
    private ArticleDao articleDao;

    public Article getArticleById(int id){
        return articleDao.getArticleById(id);
    }
}
