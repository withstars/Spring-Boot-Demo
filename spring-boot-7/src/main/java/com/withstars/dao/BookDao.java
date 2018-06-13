package com.withstars.dao;

import com.withstars.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookDao {
    Book getBookById(Long bookId);

    List<Book> listBooks();

    int addBook(Book book);

    int deleteBookById(Long bookId);

    int updateBook(Book book);
}
