package com.exaple.bookservice.service;

import com.exaple.bookservice.entity.Book;

import java.util.List;

public interface BookService {
    // lay
    List<Book> getAllBook();
    // them
    Book createBook(Book book);
}
