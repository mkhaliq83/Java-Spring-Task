package com.library.testproject.librarytestproject.libraray.service.impl;

import com.library.testproject.librarytestproject.libraray.service.AuthorService;
import com.library.testproject.librarytestproject.library.model.Author;
import com.library.testproject.librarytestproject.library.repository.AuthorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorRespository authorRespository;
    @Autowired
    public AuthorServiceImpl(AuthorRespository authorRespository) {
        this.authorRespository = authorRespository;
    }
    public List<Author> getAllAuthors() {
        return authorRespository.findAll();
    }
    public Optional<Author> fetchAuthorById(Integer id) {
        return authorRespository.findById(id);
    }
    public Author saveAuthor(Author author) {
        return authorRespository.save(author);
    }

    public void deleteAuthorById(Integer id) {
        authorRespository.deleteById(id);
    }
}
