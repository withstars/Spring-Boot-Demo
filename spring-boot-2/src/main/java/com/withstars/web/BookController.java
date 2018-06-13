package com.withstars.web;

import com.withstars.domain.Book;
import com.withstars.service.BookService;
import com.withstars.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping(value = "/api/book")
    @ResponseBody
    public Object getBookById(HttpServletRequest request){
        Long id=Long.parseLong(request.getParameter("id"));
        Book book=bookService.getBookById(id);
        return book;
    }
}
