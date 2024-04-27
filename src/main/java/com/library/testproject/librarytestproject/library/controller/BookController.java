package com.library.testproject.librarytestproject.library.controller;

import com.library.testproject.librarytestproject.libraray.dto.BookDto;
import com.library.testproject.librarytestproject.libraray.service.BookService;
import com.library.testproject.librarytestproject.library.model.Book;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
@Configuration
@RestController
@RequestMapping("/book")
public class BookController {
    @Autowired
    private BookService bookService;
    @Autowired
    private ModelMapper modelMapper;
    @GetMapping
    public ResponseEntity<List<BookDto>> getBooks(){
        List<Book> books = bookService.fetchAllBooks();
        if (books.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        List<BookDto> bookDtos = books.stream().map(book ->
                modelMapper.map(book, BookDto.class)).collect(Collectors.toList());
        return new ResponseEntity<> (bookDtos,HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<BookDto> getBooks(@PathVariable Long id){
        Optional<Book> bookOptional = bookService.fetchBookById(id);

        if (bookOptional.isPresent()) {
            BookDto bookDto = modelMapper.map(bookOptional.get(), BookDto.class);
            return ResponseEntity.ok(bookDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    @PostMapping
    public ResponseEntity<BookDto> createBook(@RequestBody BookDto bookDto){
     Book book =new Book();
        modelMapper.map(bookDto, book);
        bookService.saveBook(book);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<BookDto> deleteBook(@PathVariable Long id){
        Optional<Book> bookOptional = bookService.fetchBookById(id);

        if (bookOptional.isPresent()) {
            BookDto bookDto = modelMapper.map(bookOptional.get(), BookDto.class);
            bookService.deleteBookById(id);
            return ResponseEntity.ok(bookDto);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

}
