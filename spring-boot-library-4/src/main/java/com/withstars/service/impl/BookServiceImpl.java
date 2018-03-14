package com.withstars.service.impl;

import com.withstars.dao.BookDao;
import com.withstars.domain.Book;
import com.withstars.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{
    @Autowired
    private BookDao bookDao;

    @Override
    public Book getBookById(Long bookId) {
        return bookDao.getBookById(bookId);
    }

    @Override
    public List<Book> listBooks() {
        return bookDao.listBooks();
    }

    @Override
    public boolean addBook(Book book) {
        return bookDao.addBook(book)>0;
    }

    @Override
    public boolean removeBook(Long bookId) {
        return bookDao.deleteBookById(bookId)>0;
    }

    @Override
    public boolean updateBook(Book book) {
        return bookDao.updateBook(book)>0;
    }
}
