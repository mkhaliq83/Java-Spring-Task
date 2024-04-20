package com.library.testproject.librarytestproject.librarayService;

import com.library.testproject.librarytestproject.libraryModel.Author;
import com.library.testproject.librarytestproject.libraryRepository.AuthorRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AuthorService {
private final AuthorRespository authorRespository;
@Autowired
public AuthorService(AuthorRespository authorRespository) {
    this.authorRespository = authorRespository;
}
public List<Author> getAllAuthors() {
    return authorRespository.findAll();
}
public Optional<Author> fetchAuthorById(Integer id) {
    return authorRespository.findById(id);
}
public void saveAuthor(Author author) {
        authorRespository.save(author);
    }
 public void deleteAuthorById(Integer id) {
        authorRespository.deleteById(id);
    }
}
