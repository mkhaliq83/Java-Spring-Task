package com.library.testproject.librarytestproject.library.controller;
import com.library.testproject.librarytestproject.libraray.dto.AuthorDto;
import com.library.testproject.librarytestproject.libraray.service.AuthorService;
import com.library.testproject.librarytestproject.library.model.Author;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    private AuthorService authorService;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping
    public ResponseEntity<List<AuthorDto>> getAuthors(){
        List<Author> authors =  authorService.getAllAuthors();
        if(authors.isEmpty()){
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<AuthorDto> authorDtos = authors.stream().map(author ->
                modelMapper.map(author, AuthorDto.class)).collect(Collectors.toList());
        return new ResponseEntity<>(authorDtos, HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<AuthorDto> createAuthor(@RequestBody AuthorDto authorDto){
        // map dto to entity
        Author author =  modelMapper.map(authorDto, Author.class);
        Author createdAuthor = authorService.saveAuthor(author);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable Integer id) {
        authorService.deleteAuthorById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
