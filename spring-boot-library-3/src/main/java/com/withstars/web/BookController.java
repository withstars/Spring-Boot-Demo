package com.withstars.web;

import com.withstars.domain.Book;
import com.withstars.service.BookService;
import com.withstars.service.impl.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@RestController
@RequestMapping("/api/v1/books")
public class BookController {

    @Autowired
    private BookServiceImpl bookService;

    /**
     * 处理"/api/v1/books"的GET请求，用来获取图书列表
     * @return
     */
    @RequestMapping(value = "",method = RequestMethod.GET)
    public Object listBooks(){
        List<Book> books=bookService.listBooks();
        return books;
    }

    /**
     * 处理"/api/v1/books/{id}"的GET请求，用来获取url中id值的图书信息
     * @param bookId
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.GET)
    public Object getBookById(@PathVariable("id")Long bookId){
        Book book=bookService.getBookById(bookId);
        return book;
    }

    /**
     * 除了@ModelAttribute绑定参数之外，还可以通过@RequestParam从页面中传递参数
     * @param book
     * @return
     */
    @RequestMapping(value="",method = RequestMethod.POST)
    public String addBook(@ModelAttribute Book book){
        Boolean isAdded=bookService.addBook(book);
        if (isAdded){
            return "SUCCESS";
        }else {
            return "FAILTURE";
        }
    }

    /**
     * 处理"/api/v1/books/{id}"的DELETE请求，用来删除该id的图书记录
     * @param bookId
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.DELETE)
    public String removeBook(@PathVariable("id")Long bookId){
        boolean isDeleted=bookService.removeBook(bookId);
        if (isDeleted){
            return "SUCCESS";
        }else {
            return "FAILTURE";
        }
    }

    /**
     * 处理"/api/v1/books/{id}"的PUT请求，用来更新指定id的图书记录
     * @param bookId
     * @param book
     * @return
     */
    @RequestMapping(value = "/{id}",method = RequestMethod.PUT)
    public String updateBook(@PathVariable("id")Long bookId,@ModelAttribute Book book){
        boolean isUpdated=bookService.updateBook(book);

        if (isUpdated){
            return "SUCCESS";
        }else {
            return "FAILTURE";
        }
    }





}
