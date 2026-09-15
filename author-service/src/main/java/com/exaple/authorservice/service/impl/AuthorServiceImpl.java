package com.exaple.authorservice.service.impl;

import com.exaple.authorservice.entity.Author;
import com.exaple.authorservice.repository.AuthorRepository;

import com.exaple.authorservice.service.AuthorService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class AuthorServiceImpl implements AuthorService {
    private final AuthorRepository authorRepository;
    @Override
    public Author findById(Long authorId) {
        return authorRepository.findById(authorId).orElseThrow(
                () -> new RuntimeException("Khong ton tai ID : " + authorId)
        );
    }

    @Override
    public Author createAuthor(Author author) {
        return authorRepository.save(author);
    }
}
