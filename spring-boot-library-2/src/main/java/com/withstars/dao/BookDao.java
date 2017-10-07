package com.withstars.dao;

import com.withstars.domain.Book;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDao {
    Book getBookById(Long bookId);
}
