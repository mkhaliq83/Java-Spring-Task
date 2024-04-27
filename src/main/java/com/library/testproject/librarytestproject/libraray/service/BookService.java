package com.library.testproject.librarytestproject.libraray.service;
import com.library.testproject.librarytestproject.library.model.Book;
import com.library.testproject.librarytestproject.library.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BookService {
    public List<Book> fetchAllBooks();
    public Optional<Book> fetchBookById(Long id);
    public void saveBook(Book book);
    public void deleteBookById(Long id);
}
