package com.library.testproject.librarytestproject.library.controller;
import com.library.testproject.librarytestproject.libraray.dto.AuthorDto;
import com.library.testproject.librarytestproject.libraray.service.AuthorService;
import com.library.testproject.librarytestproject.library.model.Author;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;

    @GetMapping
    public ResponseEntity<List<Author>> getAuthors(){
        return new ResponseEntity<>(authorService.getAllAuthors(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Author> createAuthor(@RequestBody AuthorDto authorDto){
        // map dto to entity
        mapAuthDtoToAuthor(authorDto);
        Author createdAuthor = authorService.saveAuthor(mapAuthDtoToAuthor(authorDto));
        return new ResponseEntity<>(createdAuthor, HttpStatus.CREATED);
    }

    private Author mapAuthDtoToAuthor(AuthorDto authorDto) {
        Author author = new Author();
        author.setAuthorEmail(authorDto.getAuthorEmail());
        return author;
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable Integer id) {
        authorService.deleteAuthorById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
