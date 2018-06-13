package com.withstars.service.impl;

import com.withstars.dao.BookDao;
import com.withstars.domain.Book;
import com.withstars.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getBookById(Long bookId) {
        return bookDao.getBookById(bookId);
    }
}
