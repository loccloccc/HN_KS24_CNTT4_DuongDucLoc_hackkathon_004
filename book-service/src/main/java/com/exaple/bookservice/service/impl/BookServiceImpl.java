package com.exaple.bookservice.service.impl;


import com.exaple.bookservice.dto.response.AuthorServiceCallId;
import com.exaple.bookservice.entity.Book;
import com.exaple.bookservice.repository.BookRepository;
import com.exaple.bookservice.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
@RequiredArgsConstructor
public class BookServiceImpl implements BookService {
    private final BookRepository bookRepository;

    @Override
    public List<Book> getAllBook() {
        return bookRepository.findAll();
    }

    @Override
    public Book createBook(Book book) {

        return null;
    }
}
