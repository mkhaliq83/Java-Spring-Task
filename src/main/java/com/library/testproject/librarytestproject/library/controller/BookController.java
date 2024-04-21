package com.library.testproject.librarytestproject.library.controller;

import com.library.testproject.librarytestproject.libraray.service.BookService;
import com.library.testproject.librarytestproject.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;

    @GetMapping
    public ResponseEntity<List<Book>> getBooks(){
        return new ResponseEntity<>(bookService.fetchAllBooks(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBooks(@PathVariable Integer id){
        Optional<Book> returnBook = bookService.fetchBookById(id);
        return returnBook.map(book -> new ResponseEntity<>(book, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }
    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book){
        bookService.saveBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Integer id){
        bookService.deleteBookById(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
