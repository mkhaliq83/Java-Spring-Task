package com.library.testproject.librarytestproject.libraray.service;

import com.library.testproject.librarytestproject.library.model.Author;
import com.library.testproject.librarytestproject.library.repository.AuthorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface AuthorService {
    public List<Author> getAllAuthors();
    public Optional<Author> fetchAuthorById(Integer id);
    public Author saveAuthor(Author author);
    public void deleteAuthorById(Integer id);
}
