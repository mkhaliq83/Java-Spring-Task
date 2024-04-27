package com.library.testproject.librarytestproject.libraray.service.impl;


import com.library.testproject.librarytestproject.libraray.service.BookService;
import com.library.testproject.librarytestproject.library.model.Book;
import com.library.testproject.librarytestproject.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class BookServiceImpl  implements BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @Override
    public List<Book> fetchAllBooks() {
        return bookRepository.findAll();
    }
    @Override
    public Optional<Book> fetchBookById(Long id) {
        return bookRepository.findById(id);
    }
    @Override
    public void saveBook(Book book) {
        bookRepository.save(book);
    }
    @Override
    public void deleteBookById(Long id) {
        bookRepository.deleteById(id);
    }
}
