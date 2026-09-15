package com.exaple.authorservice.service;

import com.exaple.authorservice.entity.Author;

public interface AuthorService {
    Author findById(Long authorId);
    Author createAuthor(Author author);
}
