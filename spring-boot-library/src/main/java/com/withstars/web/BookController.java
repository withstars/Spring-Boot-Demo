package com.withstars.web;

import com.withstars.domain.Book;
import com.withstars.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class BookController {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/api/book")
    public @ResponseBody
    Object getBookById(HttpServletRequest request){
        long id=Integer.parseInt(request.getParameter("id"));
        Book book=bookService.getBook(id);
        return book;
    }
}
