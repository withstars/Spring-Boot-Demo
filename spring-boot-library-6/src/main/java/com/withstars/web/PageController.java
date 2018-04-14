package com.withstars.web;

import com.withstars.domain.Book;
import com.withstars.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: withstars
 * Date: 2018-04-14
 * Time: 15:49
 * Mail: withstars@126.com
 */
@Controller
@RequestMapping("/book")
public class PageController {

    @Autowired
    private BookServiceImpl bookService;

    @RequestMapping("/list")
    public String booksList(ModelMap map){
        List<Book> books=bookService.listBooks();
        map.addAttribute("books",books);
        map.addAttribute("host","withstars.cn");
        return "list";
    }


}
