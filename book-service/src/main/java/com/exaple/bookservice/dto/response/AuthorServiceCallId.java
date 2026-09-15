package com.exaple.bookservice.dto.response;


import com.exaple.bookservice.entity.Book;
import com.exaple.bookservice.repository.BookRepository;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "author-service")
public class AuthorServiceCallId {
    private BookRepository bookRepository;
    @GetMapping("/api/author/{id}")
    public Book getBookById(@PathVariable Long id) {
        return bookRepository.findBookBiAuthorId(id);
    }


}
