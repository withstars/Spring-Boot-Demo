package com.blog.dao;

import com.blog.domain.Admin;
import com.blog.domain.Article;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;
import java.sql.SQLException;

@Repository
public class ArticleDao {
    @Autowired
    public JdbcTemplate jdbcTemplate;

    public static final String GET_ARTICLE_BY_ID_SQL="SELECT * FROM article WHERE id = ?";

    public Article getArticleById(int id){
        final Article article=new Article();
        jdbcTemplate.query(GET_ARTICLE_BY_ID_SQL, new Object[]{id}, new RowCallbackHandler() {
            @Override
            public void processRow(ResultSet resultSet) throws SQLException {
                article.setId(resultSet.getInt("id"));
                article.setCatalogId(resultSet.getInt("catalog_id"));
                article.setTime(resultSet.getTime("time"));
                article.setContent(resultSet.getString("content"));
                article.setdesci(resultSet.getString("desci"));
                article.setKeywords(resultSet.getString("keywords"));
                article.setTitle(resultSet.getString("title"));
                article.setClick(resultSet.getInt("click"));
                article.setPic(resultSet.getString("pic"));
            }
        });
        return article;
    }




}
