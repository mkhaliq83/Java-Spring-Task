package com.library.testproject.librarytestproject.libraryController;
import com.library.testproject.librarytestproject.librarayService.AuthorService;
import com.library.testproject.librarytestproject.libraryModel.Author;
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
    public ResponseEntity<Author> createAuthor(@RequestBody Author author){
            authorService.saveAuthor(author);
            return new ResponseEntity<>(author, HttpStatus.CREATED);
    }
@DeleteMapping("/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable Integer id) {
    authorService.deleteAuthorById(id);
    return new ResponseEntity<>(HttpStatus.OK);
}

}
