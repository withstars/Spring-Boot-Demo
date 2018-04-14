package com.withstars.service;

import com.withstars.domain.Book;

import java.util.List;

public interface BookService {
    Book getBookById(Long bookId);

    List<Book> listBooks();

    boolean addBook(Book book);

    boolean removeBook(Long bookId);

    boolean updateBook(Book book);
}
